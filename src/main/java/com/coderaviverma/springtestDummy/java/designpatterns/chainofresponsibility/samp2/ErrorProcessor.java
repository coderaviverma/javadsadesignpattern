package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp2;

public class ErrorProcessor extends LoggerProcessor {

    public ErrorProcessor(LoggerProcessor processor) {
        super(processor);
    }

    @Override
    public void log(int level, String log) {

        if (level == 3) {
            System.out.println(" ERROR: " + log);
        } else
            super.log(level, log);
    }
}
