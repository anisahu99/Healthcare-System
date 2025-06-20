package com.healthcare.doctor_service.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
public class AvailabilityRequest {
    private LocalDateTime startTime;
    private Duration duration;
}
