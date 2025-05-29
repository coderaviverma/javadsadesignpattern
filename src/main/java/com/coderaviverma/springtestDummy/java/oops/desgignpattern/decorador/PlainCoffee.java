package com.coderaviverma.springtestDummy.java.oops.desgignpattern.decorador;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
