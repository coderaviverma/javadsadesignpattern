package com.coderaviverma.springtestDummy.java.dsa.ds.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);


        for (String strings : map.keySet()){
            System.out.println(strings);
            System.out.println(map.get(strings));
        }
    }
}
