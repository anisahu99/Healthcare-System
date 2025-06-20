package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.request.DoctorRequest;
import com.healthcare.doctor_service.dto.response.DoctorResponse;
import com.healthcare.doctor_service.entity.Doctor;
import com.healthcare.doctor_service.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    public DoctorResponse createDoctor(DoctorRequest request){
        Doctor doctor = new Doctor()
                .setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setSpecialization(request.getSpecialization());

        Doctor saved = doctorRepository.save(doctor);
        return mapToResponse(saved);
    }

    private DoctorResponse mapToResponse(Doctor doctor){
        return new DoctorResponse()
                .setDoctorId(doctor.getDoctorId())
                .setFullName(doctor.getFirstName() + " " + doctor.getLastName())
                .setSpecialization(doctor.getSpecialization());
    }
}
