package com.healthcare.doctor_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.UUID;

@Entity
@Getter @Setter @Accessors(chain = true) @NoArgsConstructor @AllArgsConstructor
public class Doctor {
    @Id
    private String doctorId;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    private String specialization;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Slot> availabilitySlots;

    @PrePersist
    public void generateId(){
        if(doctorId == null){
            doctorId = "DOC-"+ UUID.randomUUID();
        }
    }
}
