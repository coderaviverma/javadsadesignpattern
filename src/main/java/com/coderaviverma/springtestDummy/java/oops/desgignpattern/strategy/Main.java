package com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy;

import com.coderaviverma.springtestDummy.java.oops.desgignpattern.strategy.impl.OffRoadingStrategy;

public class Main {

    public static void main(String[] args) {

        Vechicle offRoadVechicle=new OffRoadVechicle();
        offRoadVechicle.drive();

        Vechicle sports=new SportsVechicle();
        sports.drive();

    }
}
