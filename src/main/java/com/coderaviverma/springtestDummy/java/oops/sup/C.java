package com.coderaviverma.springtestDummy.java.oops.sup;

public class C {
    int a=3;

    static {
        System.out.println(" C static block");

    }
    {
        System.out.println(" C block");
    }

    public C() {
        System.out.println(" C Con");
    }

    void m1(){
        System.out.println("C called");
    }
}
