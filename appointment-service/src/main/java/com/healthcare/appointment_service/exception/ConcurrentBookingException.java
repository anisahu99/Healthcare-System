package com.healthcare.appointment_service.exception;

public class ConcurrentBookingException extends RuntimeException {
    public ConcurrentBookingException(String message){
        super(message);
    }
}
