package org.jsp.StudentApp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.jsp.StudentApp.exception.IdNotFound ;
@ControllerAdvice
public class Custom_Exception_Handler {
	
	@ExceptionHandler(IdNotFound.class)
public ResponseEntity IdNotFound(IdNotFound idnotfound) {
	ResponseEntity responseEntity=new ResponseEntity("user not found", HttpStatus.NOT_FOUND);
	return responseEntity;
}
}
