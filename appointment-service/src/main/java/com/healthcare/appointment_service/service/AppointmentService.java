package com.healthcare.appointment_service.service;

import com.healthcare.appointment_service.model.*;
import com.healthcare.appointment_service.repository.AppointmentRepository;
import com.healthcare.appointment_service.dto.AppointmentRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;
import com.healthcare.appointment_service.messaging.AppointmentEventPublisher;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository repository;
    private final RedissonClient redissonClient;
    private final AppointmentEventPublisher eventPublisher;

    public Appointment bookAppointment(AppointmentRequest request) {
        String lockKey = "app_lock:" + request.getDoctorId() + ":" + request.getSlot();
        RLock lock = redissonClient.getLock(lockKey);

        try {
            if (lock.tryLock(5, 30, TimeUnit.SECONDS)) {
                Appointment appointment = new Appointment();
                appointment.setPatientId(request.getPatientId());
                appointment.setDoctorId(request.getDoctorId());
                appointment.setAppointmentTime(request.getAppointmentTime());
                appointment.setStatus("BOOKED");

                // Save to DB
                Appointment savedAppointment = repository.save(appointment);

                // Publish Kafka event
                System.out.println("Before Kafka");

                eventPublisher.publishEvent(new AppointmentEvent(
                        "event-" + System.currentTimeMillis(),
                        request.getPatientId(),
                        request.getDoctorId(),
                        request.getAppointmentTime(),
                        "CREATED"
                ));
                System.out.println("After Publish Kafka Event");

                return savedAppointment;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
        return null;
    }
}