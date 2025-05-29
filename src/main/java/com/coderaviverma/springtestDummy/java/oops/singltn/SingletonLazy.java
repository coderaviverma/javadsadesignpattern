package com.coderaviverma.springtestDummy.java.oops.singltn;

public class SingletonLazy {

    public static SingletonLazy singletonLazy;

    private SingletonLazy(){

    }

    public static SingletonLazy getInstance(){

        if (singletonLazy==null){
            return singletonLazy =new SingletonLazy();
        }
        return singletonLazy;
    }
}
