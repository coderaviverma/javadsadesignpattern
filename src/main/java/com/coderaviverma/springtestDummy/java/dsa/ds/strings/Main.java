package com.coderaviverma.springtestDummy.java.dsa.ds.strings;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String s="abcdefghijklmnopqrst";
//        System.out.println(s.substring(1));
//
//        testReference(s);
//
//        System.out.println(s);
//
//        Map<String, String> mp=new HashMap<>(2);
//        mp.put("A","a");
//        mp.put("B","b");
//        mp.put("C","c");
//
//        System.out.println(mp.values());

        char a='%';
        String b=a+0+"";
        System.out.println(b);

    }

    static void testReference(String a){
        a="asasfa";
    }


    int retur(){
        int[][] t=new int[1][1];
        return t[0][0] = 6;
    }
}
