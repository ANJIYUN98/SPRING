package com.example.app.controller.exception;

import java.io.FileNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(FileNotFoundException.class)
	public String fileNotFoundExceptionHandler(Exception error, Model model) {
		log.info("GlobalExceptionHandler's @ExceptionHandler.." + error);
		model.addAttribute("error", error);
		return "error";
	}
	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticExceptionHandler(Exception error, Model model) {
		log.info("GlobalExceptionHandler's @ExceptionHandler.." + error);
		model.addAttribute("error", error);
		return "error";
	}
	
	
	@ExceptionHandler(Exception.class)
	public String allException(Exception error, Model model) {
		log.info("GlobalExceptionHandler's @ExceptionHandler.." + error);
		model.addAttribute("error", error);
		return "error";
	}
}
