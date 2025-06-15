package com.healthcare.appointment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

//  Error Response DTO
@Data
@AllArgsConstructor
public class ApiError {
    private String code;
    private Object message;
    private Instant timeStamp;
}
