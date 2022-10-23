package com.tbe.application.services.exceptions;

public class DataBaseException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataBaseException(String error) {
		super(error);
	}

}
