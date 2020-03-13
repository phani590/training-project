package com.training.exception.handling;

public class NotADirectoryException extends Exception {

	@Override
	public String getMessage() {
		return "If the argument is not a valid directory, throw a new exception NotADirectory and exits the program.";
	}

}
