package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.response.SlotResponse;
import com.healthcare.doctor_service.repository.DoctorRepository;
import com.healthcare.doctor_service.repository.SlotRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.healthcare.doctor_service.entity.Slot;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class AvailabilityService {
    private final SlotRepository slotRepository;
    private final DoctorRepository doctorRepository;
    private final RedissonClient redissonClient;

    public SlotResponse addAvailability(String doctorId, LocalDateTime start, Duration duration){
        try{
            Slot slot = new Slot()
                    .setDoctor(doctorRepository.getReferenceById(doctorId))
                    .setStartTime(start)
                    .setEndTime(start.plus(duration))
                    .setBooked(false);
            Slot saved = slotRepository.save(slot);
            return mapToResponse(slot);
        } catch (Exception e) {
            throw new RuntimeException("Error at interacting with db", e);
        }

    }

    public List<Slot> getAvailability(String doctorId){
        try{
            return slotRepository.findByDoctor_DoctorIdAndBookedFalse(doctorId);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error at interacting with db", e);
        }
    }

    @Transactional
    public Boolean bookSlot(Long slotId){
        // Distributed lock per doctor-slot
        String lockKey = "slot:"+slotId;
        RLock lock = redissonClient.getLock(lockKey);

        try{
            // Try to acquire the lock with a timeout to prevent deadlocks
            boolean locked = lock.tryLock(5, 10, TimeUnit.SECONDS);
            if(!locked){
                throw new RuntimeException("Could not acquire lock for slot booking. Please retry");
            }
            try{
                // Critical section - only one thread per cluster can execute this
                Slot slot = slotRepository.findById(slotId)
                        .orElseThrow(() -> new EntityNotFoundException("Slot not found"));

                if(slot.isBooked()){
                    return false;   // Slot already booked
                }

                // Perform Booking
                slot.setBooked(true);
                slotRepository.save(slot);
                return true;
            }finally {
                lock.unlock();  // Always release the lock
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Booking interrupted",e);
        }
    }

    private SlotResponse mapToResponse(Slot slot){
        return new SlotResponse()
                .setSlotId(slot.getSlotId())
                .setStartTime(slot.getStartTime())
                .setEndTime(slot.getEndTime());
    }
}
