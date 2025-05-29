package com.coderaviverma.springtestDummy.java.designpatterns.state;

public class OffState  implements State{
    @Override
    public void turnUp(FanContext fanContext) {
        fanContext.setState(new LowState());
        System.out.println("Fan turned to low");
    }

    @Override
    public void turnDown(FanContext fanContext) {
        System.out.println("Fan is already OFF");
    }
}
