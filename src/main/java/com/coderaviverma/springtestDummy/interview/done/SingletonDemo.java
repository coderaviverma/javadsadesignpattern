package com.coderaviverma.springtestDummy.interview.done;

public class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {

        if (instance == null)//thread 3
            synchronized (SingletonDemo.class) {//thread 1
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }

        return instance;
    }
}
