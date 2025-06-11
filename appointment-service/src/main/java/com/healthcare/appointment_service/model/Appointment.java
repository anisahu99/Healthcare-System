package com.healthcare.appointment_service.model;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientId;
    private String doctorId;

    @Column(unique = true) // Prevents duplicates slot
    private LocalDateTime slotStart;
    private LocalDateTime slotEnd;
    private String status; // BOOKED, CANCELLED, COMPLETED

    //  private LocalDateTime appointmentTime;
    // Business Logic Method
    @NotNull
    public boolean overlaps(Appointment other){
        return this.slotStart.isBefore(other.slotEnd) && this.slotEnd.isAfter(other.slotStart);
    }
}