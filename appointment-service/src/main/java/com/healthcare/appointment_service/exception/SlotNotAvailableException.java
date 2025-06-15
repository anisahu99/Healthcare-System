package com.healthcare.appointment_service.exception;

//  Custom Exceptions

public class SlotNotAvailableException extends RuntimeException{
    public SlotNotAvailableException(String message){
        super(message);
    }
}


