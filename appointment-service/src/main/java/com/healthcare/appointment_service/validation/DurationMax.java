package com.healthcare.appointment_service.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DurationMaxValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface DurationMax {
    String message() default "Duration exceeds maximum allowed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    long hours() default 1; // Default max: 1 hour
}
