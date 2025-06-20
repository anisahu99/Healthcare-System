package com.healthcare.patient_service.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.time.Instant;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Accessors(chain = true)
public class Patient {
    @Id
    private String patientId;

    @PrePersist
    public void ensureId(){
        if(patientId == null){
            this.patientId = "PAT-" + Instant.now().toEpochMilli();
        }
    }

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String medicalHistory;
}