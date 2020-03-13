package com.training.exception.handling;

@SuppressWarnings("serial")
public class BadFileNameException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "file is not exists with this name";
	}

}
