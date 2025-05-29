package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl;

public class SportCarStrategy implements DriveStrategy {
    @Override
    public void drive() {

        System.out.println("Sports mode");
    }
}
