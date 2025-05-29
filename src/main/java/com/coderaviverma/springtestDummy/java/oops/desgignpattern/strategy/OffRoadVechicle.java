package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy;

import com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl.DriveStrategy;
import com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl.OffRoadingStrategy;

public class OffRoadVechicle extends Vechicle{

    public OffRoadVechicle() {
        super(new OffRoadingStrategy());
    }

}
