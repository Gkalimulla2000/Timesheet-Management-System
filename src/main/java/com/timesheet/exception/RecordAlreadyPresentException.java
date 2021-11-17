package com.timesheet.exception;

public class RecordAlreadyPresentException extends RuntimeException {
	public RecordAlreadyPresentException() {
		super();

	}

	public RecordAlreadyPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
// TODO Auto-generated constructor stub
	}

	public RecordAlreadyPresentException(String message, Throwable cause) {
		super(message, cause);
// TODO Auto-generated constructor stub
	}

	public RecordAlreadyPresentException(String message) {
		super(message);
// TODO Auto-generated constructor stub
	}

	public RecordAlreadyPresentException(Throwable cause) {
		super(cause);
// TODO Auto-generated constructor stub
	}
}
