package com.healthcare.doctor_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
public class ApiError {
    private String code;
    private Object message;
    private Instant timeStamp;
}