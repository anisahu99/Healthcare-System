package com.healthcare.doctor_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @Accessors(chain = true)
public class Slot {
    private Long slotId;

    @ManyToOne
    private Doctor doctor;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isBooked;
}
