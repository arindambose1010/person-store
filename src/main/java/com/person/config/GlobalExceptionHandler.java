package com.person.config;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public Map<String,Object> handleException(Exception ex) {
		Map<String,Object> response = new HashMap<String, Object>();
		
		log.error("Exception occoured "+ex.getMessage());
		response.put("statusCode", -2000);
		response.put("message","Server Error!");
		return response;
	}
	
}
