package com.coderaviverma.springtestDummy.java.oops.singltn;

public class SingletonEgar {

    public static SingletonEgar singleton=new SingletonEgar();

    public static SingletonEgar getSingleton() {
        return singleton;
    }

    private SingletonEgar(){

    }

}
