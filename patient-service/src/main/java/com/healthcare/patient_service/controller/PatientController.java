package com.healthcare.patient_service.controller;

import com.healthcare.patient_service.service.PatientService;
import com.healthcare.patient_service.dto.PatientRequest;
import com.healthcare.patient_service.dto.PatientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PatientResponse createPatient(@RequestBody PatientRequest request){
        return patientService.createPatient(request);
    }

    @GetMapping("/{id}")
    public PatientResponse getPatient(@PathVariable String id){
        return patientService.getPatient(id);
    }
}
