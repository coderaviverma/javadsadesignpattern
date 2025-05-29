package com.coderaviverma.springtestDummy.java;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {

    private static List<Object> memoryLeak = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        MemoryLeak memoryLeak1=new MemoryLeak();
        for (int i = 0; i < 1000; i++) {
            memoryLeak1.addLeak();
            if (i==100){
                System.out.println("Added: " + i);
                Thread.sleep(10);
            }
        }
    }

    public void addLeak(){
        Object o= new byte[1024*1024];
        memoryLeak.add(o);
    }
}
