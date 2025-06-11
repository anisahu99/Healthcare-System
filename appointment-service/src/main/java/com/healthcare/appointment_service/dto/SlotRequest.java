package com.healthcare.appointment_service.dto;

import lombok.Data;
import lombok.Getter;

import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
@Getter
public class SlotRequest {

    @NotNull
    private String doctorId;

    private LocalDateTime startTime;

    @DurationMin(minutes = 15)
    @DurationMax(hours = 2)
    private Duration duration;
}
