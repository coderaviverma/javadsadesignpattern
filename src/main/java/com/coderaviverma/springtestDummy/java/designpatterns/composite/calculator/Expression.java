package com.coderaviverma.springtestDummy.java.designpatterns.composite.calculator;

public class Expression implements ArthematicExpression{
    private ArthematicExpression leftExpression;
    private ArthematicExpression rightExpression;
    private Operation operation;

    public Expression(ArthematicExpression leftExpression, ArthematicExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public double evaluate() {
        double val =0;
        switch (operation){
            case ADD -> val=leftExpression.evaluate()+rightExpression.evaluate();
            case SUB -> val=leftExpression.evaluate()-rightExpression.evaluate();
            case MULTIPLY -> val= leftExpression.evaluate()*rightExpression.evaluate();
            case DIVIDE -> val=leftExpression.evaluate()/rightExpression.evaluate();
        }

        return val;
    }
}
