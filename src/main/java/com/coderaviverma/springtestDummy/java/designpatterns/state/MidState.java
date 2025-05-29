package com.coderaviverma.springtestDummy.java.designpatterns.state;

public class MidState implements State{
    @Override
    public void turnUp(FanContext fanContext) {
        fanContext.setState(new HighState());
    }

    @Override
    public void turnDown(FanContext fanContext) {
        fanContext.setState(new LowState());
    }
}
