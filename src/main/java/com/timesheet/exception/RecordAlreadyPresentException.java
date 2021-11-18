package com.timesheet.exception;

public class RecordAlreadyPresentException extends RuntimeException {
	public RecordAlreadyPresentException() {
		super();

	}

	public RecordAlreadyPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public RecordAlreadyPresentException(String message, Throwable cause) {
		super(message, cause);

	}

	public RecordAlreadyPresentException(String message) {
		super(message);

	}

	public RecordAlreadyPresentException(Throwable cause) {
		super(cause);

	}
}
