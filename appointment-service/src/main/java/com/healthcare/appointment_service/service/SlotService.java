package com.healthcare.appointment_service.service;

import com.healthcare.appointment_service.dto.SlotRequest;
import com.healthcare.appointment_service.exception.BookingException;
import com.healthcare.appointment_service.exception.ConcurrentBookingException;
import com.healthcare.appointment_service.exception.SlotNotAvailableException;
import com.healthcare.appointment_service.messaging.SlotEventPublisher;
import com.healthcare.appointment_service.model.Appointment;
import com.healthcare.appointment_service.model.SlotEvent;
import com.healthcare.appointment_service.repository.AppointmentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class SlotService {
    private final AppointmentRepository appointmentRepository;
    private final RedissonClient redissonClient;
    private final SlotEventPublisher slotEventPublisher;

    @Transactional
    public Appointment bookSlot(SlotRequest request){
        LocalDateTime slotEnd = request.getStartTime().plus(request.getDuration());

        // Distributed lock per doctor-slot
        String lockKey = "slot:" + request.getDoctorId() + request.getStartTime();
        RLock lock = redissonClient.getLock(lockKey);

        try{
            if(lock.tryLock(5, 30, TimeUnit.SECONDS)){
                // Check for existing appointments
                boolean slotAvailable = appointmentRepository
                        .findByDoctorIdAndTimeRange(request.getDoctorId(), request.getStartTime(), slotEnd)
                        .isEmpty();
                if(!slotAvailable){
                    throw new SlotNotAvailableException("The requested slot is already booked");
                }

                // Book slot
                Appointment appointment = new Appointment()
                        .setDoctorId(request.getDoctorId())
                            .setSlotStart(request.getStartTime())
                                .setSlotEnd(slotEnd)
                                    .setStatus("BOOKED");
                Appointment saved = appointmentRepository.save(appointment);


                // Publish Event
                SlotEvent event = new SlotEvent()
                        .setEventId(saved.getId().toString())
                                .setDoctorId(saved.getDoctorId())
                                        .setSlotStart(saved.getSlotStart())
                                                .setStatus(saved.getStatus());
                slotEventPublisher.publishSlotEvent(event);

                return saved;
            }
            throw new ConcurrentBookingException("Could not acquire slot lock. Please retry.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new BookingException("Booking Thread get interrupted");
        }finally {
            lock.unlock();
        }
    }
}
