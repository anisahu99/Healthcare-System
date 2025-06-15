package com.healthcare.appointment_service.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Duration;

public class DurationMinValidator implements ConstraintValidator<DurationMin, Duration> {
    private long minMinutes;

    @Override
    public void initialize(DurationMin constraint){
        this.minMinutes = constraint.minutes();
    }
    @Override
    public boolean isValid(Duration value, ConstraintValidatorContext context){
        return value != null && value.toMinutes() >= minMinutes;
    }
}
