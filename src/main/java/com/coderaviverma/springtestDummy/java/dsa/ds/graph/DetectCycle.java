package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle {

    public static void main(String[] args) {

        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4); // Cycle here

        System.out.println(hasCycle(V, adj)); // Output: true
    }

    private static boolean hasCycle(int v, List<List<Integer>> adj) {
        boolean[] visited=new boolean[v];
        boolean[] recstack=new boolean[v];


        for (int node=0;node<v;node++){

            if (!visited[node]){
                if (dfsCycle(node,visited,recstack,adj)){
                    return true;
                }
            }

        }


        return false;
    }

    private static boolean dfsCycle(int node, boolean[] visited, boolean[] recstack, List<List<Integer>> adj) {
        visited[node]=true;
        recstack[node]=true;

        for (int neighbour:adj.get(node)){
            if (!visited[neighbour] && dfsCycle(neighbour,visited,recstack,adj)){
                return true;
            }else if (recstack[neighbour]){
                return true;
            }
        }

        recstack[node]=false;
        return false;
    }
}
