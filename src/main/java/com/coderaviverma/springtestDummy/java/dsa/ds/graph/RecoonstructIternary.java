package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

import java.util.*;

class RecoonstructIternary {

    private Map<String, PriorityQueue<String>> graph = new HashMap<>();
    private LinkedList<String> itinerary = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        
        // Build the graph
        for (List<String> ticket : tickets) {
            graph
                .computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>())
                .add(ticket.get(1));
        }
            dfs("JFK");
        return itinerary;
    }

    private void dfs(String airport){
        PriorityQueue<String> destination=graph.get(airport);

        while(destination!=null && !destination.isEmpty()){
            dfs(destination.poll());
        }
        itinerary.addFirst(airport);
    }
}