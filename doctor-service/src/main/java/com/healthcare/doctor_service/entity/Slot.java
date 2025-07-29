package com.healthcare.doctor_service.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @Accessors(chain = true)
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;

    @ManyToOne
    @JoinColumn(name = "doctor_id"  )
    @JsonBackReference
    private Doctor doctor;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean booked;

    public boolean overlaps(Slot other) {
        return this.startTime.isBefore(other.endTime) &&
                this.endTime.isAfter(other.startTime);
    }
}

