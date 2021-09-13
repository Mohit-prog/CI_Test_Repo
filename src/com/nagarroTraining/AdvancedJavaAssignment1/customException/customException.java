package com.nagarroTraining.AdvancedJavaAssignment1.customException;

public class customException extends Exception {
 

	private static final long serialVersionUID = 1L;
	private String message = null;

	public customException(){
		super();
	}
	public customException(String message) {
		super();
		this.message = message;
	}
	
	public String printMessage() {
		return message;
	}
}
