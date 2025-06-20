package com.healthcare.patient_service.dto;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter
@Accessors(chain = true)
public class PatientResponse {
    private String patientId;
    private String fullName;
    private String contactNumber;
    private String medicalHistory;
}
