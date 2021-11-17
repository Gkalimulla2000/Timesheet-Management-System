package com.timesheet.exception;

public class NoEmployeeFoundException extends RuntimeException {

	public NoEmployeeFoundException() {
		super();

	}

	public NoEmployeeFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(String message, Throwable cause) {
		super(message, cause);
// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(String message) {
		super(message);
// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(Throwable cause) {
		super(cause);
// TODO Auto-generated constructor stub
	}

}
