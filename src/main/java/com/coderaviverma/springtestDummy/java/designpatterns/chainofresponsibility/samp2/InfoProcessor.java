package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp2;

public class InfoProcessor extends LoggerProcessor{

    public InfoProcessor(LoggerProcessor processor) {
        super(processor);
    }

    public void log(int level,String log){

       if (level==1){
           System.out.println(" Print log "+log);
       }else {
           super.log(level,log);
       }
    }
}
