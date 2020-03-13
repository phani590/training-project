package com.training.exception.handling;

public class BadAgeException extends Exception {

	
	public String getMessage() {
		return "age must be in 1 to 120.";	} 
}
