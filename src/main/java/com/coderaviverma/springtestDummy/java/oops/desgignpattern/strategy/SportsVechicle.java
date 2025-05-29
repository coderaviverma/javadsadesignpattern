package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy;

import com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl.SportCarStrategy;

public class SportsVechicle extends Vechicle {

    public SportsVechicle() {
        super(new SportCarStrategy());
    }
}
