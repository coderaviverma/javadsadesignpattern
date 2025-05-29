package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

public class TarjanSCC {
    private List<List<Integer>> adj;     // Adjacency list of the graph
    private boolean[] onStack;           // Tracks nodes currently on the stack
    private int[] ids, low;              // ids: visit order, low: smallest reachable id
    private Deque<Integer> stack;        // Stack to maintain the current DFS path
    private int id;                      // Unique ID assigned to each node as it's visited
    private List<List<Integer>> sccs;    // List to store all SCCs found

    /**
     * Main function to find SCCs in a directed graph
     * @param n Number of nodes in the graph
     * @param graph Adjacency list representation of graph
     * @return List of strongly connected components (each SCC is a list of integers)
     */
    public List<List<Integer>> tarjansSCC(int n, List<List<Integer>> graph) {
        this.adj = graph;
        this.onStack = new boolean[n];
        this.ids = new int[n];
        this.low = new int[n];
        this.stack = new ArrayDeque<>();
        this.sccs = new ArrayList<>();
        this.id = 0;

        // Initialize all ids as -1 (meaning unvisited)
        Arrays.fill(ids, -1);

        // Perform DFS from every unvisited node
        for (int i = 0; i < n; i++) {
            if (ids[i] == -1) {
                dfs(i);
            }
        }

        return sccs;
    }

    /**
     * Recursive DFS function for Tarjan's algorithm
     * @param at The current node being visited
     */
    private void dfs(int at) {
        // Assign ids and low-link values
        ids[at] = low[at] = id++;
        stack.push(at);            // Push node to stack
        onStack[at] = true;        // Mark node as on the stack

        // Explore all neighbors
        for (int to : adj.get(at)) {
            if (ids[to] == -1) {
                // Neighbor has not been visited → recurse
                dfs(to);
                low[at] = Math.min(low[at], low[to]);
            } else if (onStack[to]) {
                // Back edge → update low-link value
                low[at] = Math.min(low[at], ids[to]);
            }
        }

        // If node is a root of an SCC
        if (ids[at] == low[at]) {
            List<Integer> scc = new ArrayList<>();
            while (true) {
                int node = stack.pop();
                onStack[node] = false;
                scc.add(node);
                if (node == at) break;
            }
            sccs.add(scc);
        }
    }
}
