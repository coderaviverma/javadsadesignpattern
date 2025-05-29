package com.coderaviverma.springtestDummy.java.oops.desgignpattern.decorador;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+5;
    }
}
