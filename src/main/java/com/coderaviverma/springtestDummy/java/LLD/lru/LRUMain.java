package com.coderaviverma.springtestDummy.java.LLD.lru;

public class LRUMain {

    public static void main(String[] args) {

        LRU lru=new LRU(4);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        lru.put(4,4);
        lru.put(5,5);
        lru.put(6,6);

        System.out.println(lru.get(3));
//        System.out.println(lru.size());
    }
}
