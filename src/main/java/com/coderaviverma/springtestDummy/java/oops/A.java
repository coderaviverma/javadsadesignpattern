package com.coderaviverma.springtestDummy.java.oops;

public class A {

    void m1(){
        System.out.println("A - m1");
    }


    Object m2(){
        System.out.println("A - m2");
        return new Object();
    }

    private Integer m3() throws Exception{
        System.out.println("A - m3");
        return 1;
    }
}
