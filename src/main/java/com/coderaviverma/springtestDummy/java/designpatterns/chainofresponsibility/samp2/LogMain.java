package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp2;

public class LogMain {

    public static void main(String[] args) {

        LoggerProcessor log= new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        log.log(LoggerProcessor.INFO,"Info log ");


    }
}
