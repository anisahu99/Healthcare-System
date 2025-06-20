package com.healthcare.patient_service.exception;

import com.healthcare.patient_service.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {
    @ExceptionHandler(PatientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handlePatientNotFound(PatientNotFoundException ex){
        return new ApiError("PATIENT_NOT_FOUND", ex.getMessage(), false);
    }

    @ExceptionHandler(DuplicatePatientException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ApiError handleDuplicatePatientException(DuplicatePatientException ex){
        return new ApiError("DUPLICATE_PATIENT",ex.getMessage(),false);
    }
}
