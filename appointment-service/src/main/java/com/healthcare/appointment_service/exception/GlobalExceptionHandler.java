package com.healthcare.appointment_service.exception;

//  Global Exception Handler

import com.healthcare.appointment_service.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleValidationsExceptions(MethodArgumentNotValidException ex){
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error ->error.getField() + ":" + error.getDefaultMessage())
                .collect(Collectors.toList());
        Instant timestamp = Instant.now();
        return new ApiError("VALIDATION_FAILED", errors, timestamp);
    }

    @ExceptionHandler(SlotNotAvailableException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ApiError handleSlotConflict(SlotNotAvailableException ex){
        Instant timestamp = Instant.now();
        return new ApiError("SLOT_CONFLICT", ex.getMessage(), timestamp);
    }

    @ExceptionHandler(ConcurrentBookingException.class)
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public ApiError handleConcurrency(ConcurrentBookingException ex){
        Instant timestamp = Instant.now();
        return new ApiError("CONCURRENT_BOOKING", ex.getMessage(), timestamp);
    }
    @ExceptionHandler(BookingException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    public ApiError handleBookingInterrption(BookingException ex){
        Instant timestamp = Instant.now();
        return new ApiError("BOOKING_INTERRUPTED", ex.getMessage(), timestamp);
    }
}
