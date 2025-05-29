package com.coderaviverma.springtestDummy.java.designpatterns.composite.calculator;

public class Number implements ArthematicExpression{

   private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        System.out.println( " val "+value);

        return value;
    }
}
