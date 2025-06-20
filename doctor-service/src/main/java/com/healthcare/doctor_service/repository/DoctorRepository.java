package com.healthcare.doctor_service.repository;

import com.healthcare.doctor_service.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
    List<Doctor> findBySpecialization(String specialization);
}
