package com.elmaddin.weather.controller.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CityParameterValidator.class})
@Target({ METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface CityNameConstraint {
    String message() default "Invalid city name!";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}