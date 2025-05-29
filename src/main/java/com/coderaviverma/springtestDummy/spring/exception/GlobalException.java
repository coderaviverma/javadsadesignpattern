package com.coderaviverma.springtestDummy.spring.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleInvalidBooks(BookNotFoundException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
