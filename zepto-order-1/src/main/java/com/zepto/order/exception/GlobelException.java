package com.zepto.order.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelException {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<ErrorRes> handleOrderNotFoundException(OrderNotFoundException notFound) {
		ErrorRes es = new ErrorRes();
		es.setErrorCode("Order Not Found - 101");
		es.setErrorMessage(notFound.getMessage());
		return ResponseEntity.ok(es);

	}
}