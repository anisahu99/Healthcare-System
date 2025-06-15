package com.healthcare.appointment_service.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.hv.time.DurationMinValidator;

import java.lang.annotation.*;

@Constraint(validatedBy = DurationMinValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DurationMin {
    String message() default "Duration too short";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    long minutes() default 0;
}
