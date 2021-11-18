package com.timesheet.exception.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.timesheet.exception.NoEmployeeFoundException;
import com.timesheet.exception.NoProjectFoundException;
import com.timesheet.exception.RecordAlreadyPresentException;


@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(NoEmployeeFoundException.class)
	public ResponseEntity<Object> NoEmployeeFoundException(NoEmployeeFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoProjectFoundException.class)
	public ResponseEntity<Object> NoProjectFoundException(NoProjectFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public ResponseEntity<Object> RecordAlreadyPresentException(RecordAlreadyPresentException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_GATEWAY);
		
	}
}
