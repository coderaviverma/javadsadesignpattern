package com.coderaviverma.springtestDummy.java.designpatterns.state;

public class FanContext {

    private State state;

    public FanContext() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    void turnUp() {
        state.turnUp(this);
    }

    void turnDown() {
        state.turnDown(this);
    }
}
