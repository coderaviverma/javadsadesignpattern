package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl;

public class OffRoadingStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Off Roading mode");
    }
}
