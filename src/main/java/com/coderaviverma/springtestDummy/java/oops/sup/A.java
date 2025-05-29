package com.coderaviverma.springtestDummy.java.oops.sup;

public  class A extends C {
    final int a=1;

    static {
        System.out.println(" A static block");

    }
    {
        System.out.println(" A block");
    }

    public A() {
        System.out.println(" A Con");
    }

    /*final*/ void m1(){
        System.out.println("A called");
    }
}
