package com.coderaviverma.springtestDummy.java.dsa.ds.graph;

public class DisJointSet {

    int[] parent,rank;

    public DisJointSet(int size){
        parent=new int[size];
        rank=new int[size];

        for (int i = 0; i < size; i++) {
            parent[i]=i;
            rank[i]=0;
        }
    }

    public int find(int x){
        if (parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

    public boolean union(int x,int y){
        int xRoot=find(x);
        int yRoot=find(y);

        if (xRoot==yRoot) return false;

        if (rank[xRoot]<rank[yRoot]){
            parent[xRoot]=yRoot;
        }else if (rank[xRoot] > rank[yRoot]){
            parent[yRoot]=xRoot;
        }else {
            parent[yRoot]=xRoot;
            rank[xRoot]++;
        }

        return true;
    }

    public boolean union2(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return false; // cycle detected
        parent[py] = px; // union
        return true;
    }

   static boolean hasCycle(int n, int[][] edges){
        DisJointSet set=new DisJointSet(n);
        for (int[] edge:edges){
            if (!set.union2(edge[0],edge[1])){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4} // cycle edge
        };

        int[][] edges2 = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4} // cycle edge
        };

        System.out.println(hasCycle(6,edges2));
    }
}
