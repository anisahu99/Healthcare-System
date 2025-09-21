package com.healthcare.doctor_service.repository;

import com.healthcare.doctor_service.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

    // Fetch all doctors with their availability slots ( avoid lazy init issues )
    @Query("SELECT d from Doctor d LEFT JOIN FETCH d.availabilitySlots")
    List<Doctor> findAllWithSlots();

    // Fetch doctors by specializations and include slots
    @Query("SELECT d from Doctor d LEFT JOIN FETCH d.availabilitySlots WHERE d.specialization =:specialization")
    List<Doctor> findBySpecializationWithSlots(@Param("specialization") String specialization);
}
