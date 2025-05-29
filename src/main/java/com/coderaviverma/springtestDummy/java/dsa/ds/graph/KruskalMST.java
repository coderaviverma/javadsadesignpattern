package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

class KruskalMST {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static class DisjointSet {
        int[] parent, rank;

        DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int u) {
            if (parent[u] != u) parent[u] = find(parent[u]);  // Path compression
            return parent[u];
        }

        void union(int u, int v) {
            int rootU = find(u), rootV = find(v);
            if (rootU == rootV) return;
            if (rank[rootU] < rank[rootV]) parent[rootU] = rootV;
            else if (rank[rootU] > rank[rootV]) parent[rootV] = rootU;
            else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }

    static int kruskal(int V, List<Edge> edges) {
        Collections.sort(edges);
        DisjointSet ds = new DisjointSet(V);
        int mstWeight = 0;

        for (Edge edge : edges) {
            int u = edge.src, v = edge.dest;
            if (ds.find(u) != ds.find(v)) {
                ds.union(u, v);
                mstWeight += edge.weight;
                System.out.println("Edge added: " + u + " - " + v + " (Weight: " + edge.weight + ")");
            }
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        int V = 4;
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        );

        int weight = kruskal(V, edges);
        System.out.println("Total weight of MST: " + weight);
    }
}
