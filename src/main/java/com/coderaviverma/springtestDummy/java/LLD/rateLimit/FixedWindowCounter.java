package com.coderaviverma.springtestDummy.java.LLD.rateLimit;

import java.util.HashMap;
import java.util.Map;

public class FixedWindowCounter {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (isAllowed("user123")){
                System.out.println("enter ");
            }else {
                System.out.println(" exit");
            }
        }

    }

    static Map<String, Integer> counter= new HashMap<>();
   static Map<String,Long> windowStart = new HashMap<>();

    static boolean isAllowed(String userId){
        long currentSecond = System.currentTimeMillis()/1000;
        int limit = 5;
        int windowSize =60;

        long window = currentSecond/windowSize;
        if (windowStart.getOrDefault(userId,-1L)!=window){
            windowStart.put(userId,window);
            counter.put(userId,1);
            return true;
        }

        int requests = counter.getOrDefault(userId,0);
        if (requests<limit){
            counter.put(userId,requests+1);
            return true;
        }

        return false;
    }
}
