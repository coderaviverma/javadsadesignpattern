package com.coderaviverma.springtestDummy.java.designpatterns.composite.calculator;

public class CalculaterMain {

    public static void main(String[] args) {

        ArthematicExpression expression1=new Number(20);
        ArthematicExpression expression2=new Number(10);

        ArthematicExpression add= new Expression(expression1,expression2,Operation.ADD);
        System.out.println(add.evaluate());

    }
}
