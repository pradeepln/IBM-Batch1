package com.ibm.training.exceptions;

public class StackEmptyException extends RuntimeException{
	
	public StackEmptyException() {
		
	}

	public StackEmptyException(String message) {
		super(message);
	}
}
