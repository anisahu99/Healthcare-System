package com.healthcare.doctor_service.repository;

import com.healthcare.doctor_service.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    List<Slot> findByDoctorIdAndIsBookedFalse(String doctorId);
}
