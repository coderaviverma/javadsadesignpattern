package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

public class DijkstraAlgo {

    static class Pair {
        int vertex, weight;

        Pair(int v, int w) {
            vertex = v;
            weight = w;
        }

        static int[] dijkstra(int V, List<List<Pair>> adj, int source) {
            PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparing(p -> p.weight));
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[source] = 0;
            pq.add(new Pair(source, 0));

            while (!pq.isEmpty()) {
                Pair curr = pq.poll();
                int u = curr.vertex;

                for (Pair neighbor : adj.get(u)) {
                    int v = neighbor.vertex;
                    int weight = neighbor.weight;
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.add(new Pair(v, dist[v]));
                    }

                }

            }

            return dist;
        }

        public static void main(String[] args) {
            int V = 4; // number of vertices
            List<List<Pair>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());

            // Add edges
            adj.get(0).add(new Pair(1, 4));
            adj.get(0).add(new Pair(2, 1));
            adj.get(1).add(new Pair(3, 1));
            adj.get(2).add(new Pair(1, 2));
            adj.get(2).add(new Pair(3, 5));

            int[] result = dijkstra(V, adj, 0);

            System.out.println("Shortest distances from source 0:");
            for (int i = 0; i < result.length; i++)
                System.out.println("To " + i + " → " + result[i]);
        }
    }
}
