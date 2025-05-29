package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp2;

public class DebugProcessor extends LoggerProcessor {

    public DebugProcessor(LoggerProcessor processor) {
        super(processor);
    }

    @Override
    public void log(int level, String log) {
        if (level == 2) {
            System.out.println(" DEBUG log - " + log);
        } else
            super.log(level, log);
    }
}
