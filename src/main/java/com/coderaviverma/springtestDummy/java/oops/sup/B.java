package com.coderaviverma.springtestDummy.java.oops.sup;

public class B extends A {

    final static int a = 0;


    static {
//        a=5;
        System.out.println(" B static block");

    }
    {
        System.out.println(" B block");
    }

    public B() {
//        a=5;
        System.out.println(" B Con");
    }

    void m1(){
        super.m1();
        System.out.println("B "+super.a);
    }
}
