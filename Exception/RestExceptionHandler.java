package com.apple.code.challenge.flagSelector.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.apple.code.challenge.flagSelector.Model.ErrorResponseJson;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponseJson> handleResourceNotFound(ResourceNotFoundException e){
		
		System.out.println("Inside handleResourceNotFound #########");
		
		return new ResponseEntity<ErrorResponseJson>(new ErrorResponseJson(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage(), e.getMessage()), HttpStatus.NOT_FOUND); 
		
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseJson> generalExceptionHandler(Exception e){
		
		System.out.println("Inside handleResourceNotFound #########");
		
		return new ResponseEntity<ErrorResponseJson>(new ErrorResponseJson(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), e.getMessage(), e.getMessage()), HttpStatus.BAD_REQUEST); 
		
		
	}
	
	

}
