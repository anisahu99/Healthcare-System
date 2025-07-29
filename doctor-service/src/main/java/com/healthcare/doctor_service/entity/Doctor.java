package com.healthcare.doctor_service.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Doctor", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"country_code", "phone_number"})
})
@Getter @Setter @Accessors(chain = true) @NoArgsConstructor @AllArgsConstructor
public class Doctor {
    @Id
    private String doctorId;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    private String specialization;

    @Column(name = "country_code", length = 5, nullable = false)
    private String countryCode; //  +1, +91, etc.

    @Column(name = "phone_number", length = 15, nullable = false)
    private String phoneNumber; //  9415050850

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Slot> availabilitySlots;

    @PrePersist
    public void generateId(){
        if(doctorId == null){
            doctorId = "DOC-"+ UUID.randomUUID();
        }
    }
}
