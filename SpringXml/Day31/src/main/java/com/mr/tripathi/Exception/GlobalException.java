package com.mr.tripathi.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorDetails> myException1(IllegalArgumentException ie, WebRequest wb) {
		MyErrorDetails me = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wb.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(me, HttpStatus.BAD_REQUEST);
	}
    
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myException2(MethodArgumentNotValidException ie) {
		MyErrorDetails me = new MyErrorDetails(LocalDateTime.now(), "Validation Error", ie.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyErrorDetails>(me, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myException3(Exception ie, WebRequest wb) {
		MyErrorDetails me = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wb.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(me, HttpStatus.BAD_REQUEST);
	}
}
