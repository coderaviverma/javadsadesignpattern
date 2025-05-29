package com.coderaviverma.springtestDummy.java.designpatterns.state;

public class HighState implements State{
    @Override
    public void turnUp(FanContext fanContext) {
        System.out.println("Fan already OFF");
    }

    @Override
    public void turnDown(FanContext fanContext) {
        fanContext.setState(new MidState());
    }
}
