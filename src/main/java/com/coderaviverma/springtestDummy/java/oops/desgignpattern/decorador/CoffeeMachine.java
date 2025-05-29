package com.coderaviverma.springtestDummy.java.oops.desgignpattern.decorador;

public class CoffeeMachine {

    public static void main(String[] args) {

        Coffee coffee=new PlainCoffee();
        System.out.println("Desc - "+ coffee.getDescription());
        System.out.println("Cost - "+ coffee.getCost());

        Coffee milkCoffee=new MilkDecorator(new PlainCoffee());
        System.out.println("Desc - "+ milkCoffee.getDescription());
        System.out.println("Cost - "+ milkCoffee.getCost());

        Coffee milkSugarCoffee=new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("Desc - "+ milkSugarCoffee.getDescription());
        System.out.println("Cost - "+ milkSugarCoffee.getCost());

        Coffee sugarCoffee=new SugarDecorator(new PlainCoffee());
        System.out.println("Desc - "+ sugarCoffee.getDescription());
        System.out.println("Cost - "+ sugarCoffee.getCost());
    }
}
