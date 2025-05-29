package com.coderaviverma.springtestDummy.java.oops;

public class B extends A{
    void m1(){
        System.out.println("B - m1");
    }


    String m2(){
        System.out.println("B - m2");
        return new String();
    }


    protected Integer m3() throws RuntimeException{
        System.out.println("B - m3");
        return 1;
    }
}
