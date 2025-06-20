package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.response.SlotResponse;
import com.healthcare.doctor_service.repository.DoctorRepository;
import com.healthcare.doctor_service.repository.SlotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.healthcare.doctor_service.entity.Slot;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AvailabilityService {
    private final SlotRepository slotRepository;
    private final DoctorRepository doctorRepository;

    @Transactional
    public SlotResponse addAvailability(String doctorId, LocalDateTime start, Duration duration){
        Slot slot = new Slot()
                .setDoctor(doctorRepository.getReferenceById(doctorId))
                .setStartTime(start)
                .setEndTime(start.plus(duration))
                .setBooked(false);
        Slot saved = slotRepository.save(slot);
        return mapToResponse(slot);
    }
    private SlotResponse mapToResponse(Slot slot){
        return new SlotResponse()
                .setSlotId(slot.getSlotId())
                .setStartTime(slot.getStartTime())
                .setEndTime(slot.getEndTime());
    }
}
