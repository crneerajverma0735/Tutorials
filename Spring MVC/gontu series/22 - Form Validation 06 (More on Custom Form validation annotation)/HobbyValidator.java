package com.neeraj.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{
	
	private String listOfValidHobbies;
	
	
	public void initialize(IsValidHobby IsValidHobby) {
		// TODO Auto-generated method stub
		this.listOfValidHobbies = IsValidHobby.listOfValidHobbies();
	}
	
	
	public boolean isValid(String studentHobby, ConstraintValidatorContext context) {
		
		
		if(studentHobby == null) {
			return false;
		}
		if(studentHobby.matches(listOfValidHobbies)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
