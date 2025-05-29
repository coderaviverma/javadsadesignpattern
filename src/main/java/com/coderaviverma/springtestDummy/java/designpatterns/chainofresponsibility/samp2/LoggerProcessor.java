package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp2;

public abstract class LoggerProcessor {

    public static final int INFO = 1;

    public static final int DEBUG = 2;

    public static final int ERROR = 3;

    protected LoggerProcessor nextProcessor;

    public LoggerProcessor(LoggerProcessor processor){
        nextProcessor=processor;
    }

    public void log(int level,String log){

        if (nextProcessor!=null){
            nextProcessor.log(level,log);
        }
    }
}
