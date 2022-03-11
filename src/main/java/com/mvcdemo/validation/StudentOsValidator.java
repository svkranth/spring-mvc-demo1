package com.mvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentOsValidator implements ConstraintValidator<ValidateOS, String[]>{
	
	private int selectionLimit;

	@Override
	public void initialize(ValidateOS constraintAnnotation) {
		// TODO Auto-generated method stub
		selectionLimit = constraintAnnotation.limit();
	}

	@Override
	public boolean isValid(String[] value, ConstraintValidatorContext context) {
		int actualselectedItems = value.length;
		if(actualselectedItems >= selectionLimit) {
			return true;
		}else {
			return false;
		}
	}	
	
}
