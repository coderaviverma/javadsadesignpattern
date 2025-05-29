package com.coderaviverma.springtestDummy.java.LLD.rateLimit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RateLimiterMine {

    public static void main(String[] args) {

        System.out.println();
    }

    private static boolean rateLimiter() {
        int rateTime = 2; // Time window in seconds
        int rateLimit = 10; // Max allowed requests
        String user = "user123";
        Map<String, TreeMap<Integer, Integer>> hm = new HashMap<>();

        for (int i = 0; i < 20; i++) {
            int second = LocalDateTime.now().get(ChronoField.SECOND_OF_MINUTE);
            TreeMap<Integer, Integer> tree = hm.getOrDefault(user, new TreeMap<>());

            // Clean up old entries beyond rateTime window
            Iterator<Map.Entry<Integer, Integer>> it = tree.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> entry = it.next();
                int diff =second - entry.getKey();
                if ( diff > rateTime) {
                    it.remove();
                }
            }

            // Count total recent requests
            int requestCount = tree.values().stream().mapToInt(val -> val).sum();

            if (requestCount >= rateLimit) {
                System.out.println("Blocked at iteration " + (i + 1));
                return false;
            }

            tree.put(second, tree.getOrDefault(second, 0) + 1);
            hm.put(user, tree);
        }

        System.out.println("All requests allowed.");
        return true;
    }

}
