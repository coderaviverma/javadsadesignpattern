package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp1;

//Abstract Handler
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next=next;
    }

    public abstract void handlerRequest(String request);
}
