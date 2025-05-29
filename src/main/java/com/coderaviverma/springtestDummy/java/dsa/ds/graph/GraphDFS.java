package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

public class GraphDFS {
    static void dfs(int node, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(4));

        Set<Integer> visited = new HashSet<>();
        dfs(0, visited, graph); // Output: 0 1 3 4 5 2
    }
}
