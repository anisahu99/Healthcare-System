package com.healthcare.doctor_service.exception;

import com.healthcare.doctor_service.dto.response.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.Instant;

public class GlobalExceptionHandler {
    @ExceptionHandler(DoctorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ApiError handleDoctorNotFoundException(DoctorNotFoundException ex){
        return new ApiError("DOCTOR_NOT_FOUND",ex.getMessage(), Instant.now());
    }
}
