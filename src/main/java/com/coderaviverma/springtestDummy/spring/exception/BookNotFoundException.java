package com.coderaviverma.springtestDummy.spring.exception;

public class BookNotFoundException extends RuntimeException {

    private String errorCode;

    public BookNotFoundException(String message,String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
