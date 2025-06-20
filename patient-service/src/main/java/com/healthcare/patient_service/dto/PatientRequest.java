package com.healthcare.patient_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class PatientRequest {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private String contactNumber;
    private String medicalHistory;
}
