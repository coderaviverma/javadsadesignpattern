package com.coderaviverma.springtestDummy.java.LLD.rateLimit;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SlidingWindowRateLimiter {

    private final int maxRequest;
    private final long timeWindowMillis;
    private final Map<String, Deque<Long>> userLogs;

    public static void main(String[] args) throws InterruptedException {

        SlidingWindowRateLimiter slidingWindowRateLimiter = new SlidingWindowRateLimiter(10, 2);

        for (int i = 0; i < 20; i++) {
            if (i == 15)
                Thread.sleep(2000);
            System.out.println(slidingWindowRateLimiter.isAllowed("user123"));
        }
    }

    public SlidingWindowRateLimiter(int maxRequest, int timeWindowSecond) {
        this.maxRequest = maxRequest;
        this.timeWindowMillis = timeWindowSecond * 1000L;
        userLogs = new HashMap<>();
    }

    public boolean isAllowed(String userId) {
        long currentMillies = System.currentTimeMillis();
        Deque<Long> requestTime = userLogs.getOrDefault(userId, new LinkedList<>());

        while (!requestTime.isEmpty() && (currentMillies - requestTime.peekFirst()) > timeWindowMillis) {
            requestTime.pollFirst();
        }

        if (requestTime.size() < maxRequest) {
            requestTime.add(currentMillies);
            userLogs.put(userId, requestTime);
            return true;
        }
        return false;
    }
}
