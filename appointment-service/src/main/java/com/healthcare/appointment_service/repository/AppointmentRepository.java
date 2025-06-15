package com.healthcare.appointment_service.repository;

import com.healthcare.appointment_service.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.time.LocalDateTime;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("""
            SELECT a FROM Appointment a WHERE a.doctorId = :doctorId
            AND a.slotStart < :endTime
            AND a.slotEnd > :startTime
            AND a.status = 'BOOKED'
            """)
    List<Appointment> findByDoctorIdAndTimeRange(
            @Param("doctorId") String doctorId,
            @Param("startTime") LocalDateTime startTime,
            @Param("endTime") LocalDateTime endTime

            );
}