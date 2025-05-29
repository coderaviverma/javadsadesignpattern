package com.coderaviverma.springtestDummy.spring.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerGlobalException {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody//to return json text
    public ResponseEntity<String> handleBooksValidation(RuntimeException e){
       return ResponseEntity.badRequest().body(e.getMessage());
    }
}
