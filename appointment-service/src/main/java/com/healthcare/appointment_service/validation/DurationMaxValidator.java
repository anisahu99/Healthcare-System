package com.healthcare.appointment_service.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Duration;

public class DurationMaxValidator implements ConstraintValidator<DurationMax, Duration> {
    private long maxHours;

    @Override
    public void initialize(DurationMax constraintAnnotation){
        this.maxHours = constraintAnnotation.hours();
    }

    @Override
    public boolean isValid(Duration value, ConstraintValidatorContext context){
        if(value==null){
            return true;    // Null handle by @NotNull
        }
        return value.toHours() <= maxHours;
    }
}
