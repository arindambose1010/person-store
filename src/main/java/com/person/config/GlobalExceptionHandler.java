package com.person.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public Map<String,Object> handleException(Exception ex) {
		Map<String,Object> response = new HashMap<String, Object>();
		ex.printStackTrace();
		response.put("statusCode", -2000);
		response.put("message",ex.getMessage());
		return response;
	}
	
}
