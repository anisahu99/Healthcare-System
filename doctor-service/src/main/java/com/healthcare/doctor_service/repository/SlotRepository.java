package com.healthcare.doctor_service.repository;

import com.healthcare.doctor_service.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {
    List<Slot> findByDoctor_DoctorIdAndBookedFalse(String doctorId);
//    Tell Spring explicitly that you want to filter by doctor.doctorId:
//    Notice the underscore _ → it tells Spring to traverse the doctor relationship.
/*
✅ It will generate SQL like:
SELECT * FROM slot
WHERE doctor_id = ? AND booked = false;

*/


}
