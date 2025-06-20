package com.healthcare.patient_service.exception;

public class DuplicatePatientException extends RuntimeException {
    public DuplicatePatientException(String message) {
        super(message);
    }
}
