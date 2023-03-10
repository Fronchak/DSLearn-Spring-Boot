package com.fronchak.DSLearn.exceptions;

public class ForbiddenException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ForbiddenException(String msg) {
		super(msg);
	}
	
	public static String getError() {
		return "Forbidden";
	}
}
