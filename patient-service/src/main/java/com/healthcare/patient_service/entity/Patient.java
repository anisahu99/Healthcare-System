package com.healthcare.patient_service.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Accessors(chain = true)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String patientId;

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String medicalHistory;
}