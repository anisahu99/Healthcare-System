package com.healthcare.doctor_service.repository;

import com.healthcare.doctor_service.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {
    @Query("""
SELECT s FROM Slot s
JOIN s.doctor d
WHERE d.doctorId = :doctorId
  AND (s.booked = false OR s.booked IS NULL)
""")
    List<Slot> findAvailableSlotsByDoctor(@Param("doctorId") String doctorId);
//    List<Slot> findByDoctor_DoctorIdAndBookedFalse(String doctorId);
//    Tell Spring explicitly that you want to filter by doctor.doctorId:
//    Notice the underscore _ → it tells Spring to traverse the doctor relationship.
/*
✅ It will generate SQL like:
SELECT * FROM slot
WHERE doctor_id = ? AND booked = false;

*/


}
