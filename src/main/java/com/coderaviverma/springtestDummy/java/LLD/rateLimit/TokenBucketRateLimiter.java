package com.coderaviverma.springtestDummy.java.LLD.rateLimit;

import java.util.concurrent.locks.ReentrantLock;

public class TokenBucketRateLimiter {
    private final int capacity;
    private final double refillRatePerSecond;
    private double token;
    private long lastRefillTimeStamp;
    private final ReentrantLock lock=new ReentrantLock();

    public static void main(String[] args) {
        TokenBucketRateLimiter tokenBucketRateLimiter=new TokenBucketRateLimiter(10,5);
        for (int i = 0; i < 20; i++) {
            System.out.println(tokenBucketRateLimiter.allowedRequest());
        }
    }


    public TokenBucketRateLimiter(int capacity, double refillRatePerSecond) {
        this.capacity = capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.token = capacity;
        this.lastRefillTimeStamp = System.nanoTime();
    }

    public boolean allowedRequest(){

        lock.lock();

        try{
            refill();
            if (token>=1){
                token--;
                return true;
            }
            return false;
        }finally {
            lock.unlock();
        }

    }

    private void refill(){
        long now = System.nanoTime();
        double tokenToAdd= (now-lastRefillTimeStamp)/1e9*refillRatePerSecond;
        token= Math.min(capacity,tokenToAdd + token);
        lastRefillTimeStamp=now;
    }
}
