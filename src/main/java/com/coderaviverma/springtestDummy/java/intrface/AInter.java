package com.coderaviverma.springtestDummy.java.intrface;

public interface AInter {

     void i1();
    public void i2();
//    protected void i3(); //compile time error

    private void i4(){

    }

    default void i5(){ //default

    }

    static void i6(){ //static should always have body

    }
}
