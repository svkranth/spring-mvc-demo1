package com.mvcdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=StudentOsValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface ValidateOS {
	
	public int limit() default 1;
	
	public String message() default "Choose OS";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
