package com.coderaviverma.springtestDummy.java.designpatterns.chainofresponsibility.samp1;

public class AuthHandler extends Handler{
    @Override
    public void handlerRequest(String request) {
        if (request.equals("AUTH")){
            System.out.println("AuthHandler process the request");
        }else if (next!=null){
            next.handlerRequest(request);
        }
    }
}
