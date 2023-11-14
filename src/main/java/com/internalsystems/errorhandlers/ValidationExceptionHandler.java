package com.internalsystems.errorhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.internalsystems.Utils.ResponseBean;

@ControllerAdvice
public class ValidationExceptionHandler {
	
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ResponseBean> handleValidationException(MethodArgumentNotValidException ex) {
   
       	ResponseBean response = new ResponseBean();
        ex.getBindingResult().getFieldErrors().forEach(error  ->{
        	response.setResponseDesc(error.getField()+" : "+error.getDefaultMessage());
        });
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response); 
      }
}