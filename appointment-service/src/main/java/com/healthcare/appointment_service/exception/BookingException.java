package com.healthcare.appointment_service.exception;

public class BookingException extends RuntimeException {
    public BookingException(String message){
        super(message);
    }
}
