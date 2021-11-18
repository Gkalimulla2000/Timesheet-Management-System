package com.timesheet.exception;

public class NoProjectFoundException extends RuntimeException {

	public NoProjectFoundException() {
		super();

	}

	public NoProjectFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public NoProjectFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoProjectFoundException(String message) {
		super(message);

	}

	public NoProjectFoundException(Throwable cause) {
		super(cause);

	}

}
