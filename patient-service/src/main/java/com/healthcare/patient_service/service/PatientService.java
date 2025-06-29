package com.healthcare.patient_service.service;

import com.healthcare.patient_service.dto.PatientRequest;
import com.healthcare.patient_service.dto.PatientResponse;
import com.healthcare.patient_service.entity.Patient;
import com.healthcare.patient_service.exception.DuplicatePatientException;
import com.healthcare.patient_service.exception.PatientNotFoundException;
import com.healthcare.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public PatientResponse createPatient(PatientRequest request){
        //  Business rule: Prevent duplicate patients
        if(patientRepository.existByContactNumber(request.getContactNumber())){
            throw new DuplicatePatientException("Patient already exists");
        }
        Patient patient = new Patient()
                .setFirstName(request.getFirstName())
                .setLastName(request.getFirstName())
                .setContactNumber(request.getContactNumber())
                .setMedicalHistory(request.getMedicalHistory());
        Patient saved = patientRepository.save(patient);

        return new PatientResponse()
                .setPatientId(saved.getPatientId())
                .setFullName(saved.getFirstName() + " " + saved.getLastName())
                .setContactNumber(saved.getContactNumber())
                .setMedicalHistory(saved.getMedicalHistory());
    }

    public PatientResponse getPatient(String id){
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException("Patient not found with ID: " + id));
        return mapToResponse(patient);
    }
    private PatientResponse mapToResponse(Patient patient){
        return new PatientResponse()
                .setPatientId(patient.getPatientId())
                .setFullName(patient.getFirstName()+" "+patient.getLastName())
                .setContactNumber(patient.getContactNumber());
    }
}
