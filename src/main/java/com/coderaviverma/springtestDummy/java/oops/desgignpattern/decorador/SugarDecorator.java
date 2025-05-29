package com.coderaviverma.springtestDummy.java.oops.desgignpattern.decorador;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+5;
    }
}
