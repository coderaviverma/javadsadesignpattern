package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy;

import com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl.DriveStrategy;

public class Vechicle {

    private DriveStrategy driveStrategy;

    public Vechicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

   public void drive(){
        driveStrategy.drive();
    }

}
