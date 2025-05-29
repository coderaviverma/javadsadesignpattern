package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

public class CheapFlight {

    Map<Integer, List<int[]>> graph = new HashMap<>();
    int[][] memo;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        memo = new int[n][k + 2]; // memo[node][stopsLeft]
        for (int[] row : memo)
            Arrays.fill(row, -2); // -2 means unvisited

        for (int[] f : flights) {
            graph.computeIfAbsent(f[0], x -> new ArrayList<>()).add(new int[]{f[1], f[2]});
        }

        int res = dfs(src, dst, k + 1); // k+1 because stops count includes destination reach
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int dfs(int current, int dst, int stopsLeft) {
        if (current == dst) return 0;
        if (stopsLeft == 0) return Integer.MAX_VALUE;

        if (memo[current][stopsLeft] != -2) return memo[current][stopsLeft];

        int min = Integer.MAX_VALUE;
        if (graph.containsKey(current)) {
            for (int[] nei : graph.get(current)) {
                int nextCity = nei[0], price = nei[1];
                int temp = dfs(nextCity, dst, stopsLeft - 1);
                if (temp != Integer.MAX_VALUE) {
                    min = Math.min(min, temp + price);
                }
            }
        }

        memo[current][stopsLeft] = min;
        return min;
    }

}
