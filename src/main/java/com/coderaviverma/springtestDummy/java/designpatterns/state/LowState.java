package com.coderaviverma.springtestDummy.java.designpatterns.state;

public class LowState implements State {
    @Override
    public void turnUp(FanContext fanContext) {
        fanContext.setState(new MidState());
        System.out.println("Fan turned to Medium");
    }

    @Override
    public void turnDown(FanContext fanContext) {
        System.out.println("Fan turned OFF");
    }
}
