package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.request.DoctorRequest;
import com.healthcare.doctor_service.dto.response.DoctorResponse;
import com.healthcare.doctor_service.entity.Doctor;
import com.healthcare.doctor_service.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    public DoctorResponse createDoctor(DoctorRequest request){
        try{
            Doctor doctor = new Doctor()
                    .setFirstName(request.getFirstName())
                    .setLastName(request.getLastName())
                    .setSpecialization(request.getSpecialization())
                    .setCountryCode(request.getCountryCode())
                    .setPhoneNumber(request.getPhoneNumber());

            Doctor saved = doctorRepository.save(doctor);
            return mapToResponse(saved);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error at interacting with db", e);
        }


    }

    public List<Doctor> getDoctor(){
        try{
            return doctorRepository.findAll();
        } catch (RuntimeException e) {
            throw new RuntimeException("Error at interacting with db", e);
        }

    }

    public List<Doctor>getDoctorBySpecialization(String specialization){
        try{
        return doctorRepository.findBySpecialization(specialization);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error at interacting with db", e);
        }
    }

    private DoctorResponse mapToResponse(Doctor doctor){
        return new DoctorResponse()
                .setDoctorId(doctor.getDoctorId())
                .setFullName(doctor.getFirstName() + " " + doctor.getLastName())
                .setSpecialization(doctor.getSpecialization())
                .setPhoneNumber(doctor.getCountryCode()+doctor.getPhoneNumber());
    }
}
