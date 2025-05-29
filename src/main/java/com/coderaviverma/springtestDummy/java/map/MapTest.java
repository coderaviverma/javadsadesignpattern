package com.coderaviverma.springtestDummy.java.map;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map tes=new HashMap();
        Map<Weeks,String> weeksStringMap=new EnumMap<>(Weeks.class);

        Set<Weeks> weeks = weeksStringMap.keySet();

        Set<Map.Entry<Weeks, String>> entries = weeksStringMap.entrySet();


        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
//        treeMap.put(null,null);
        for (int i = 0; i < 20; i++) {
            treeMap.put(i,i);
        }
//        System.out.println(treeMap.subMap(4,10));

        LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>(32);

        //hashcode formula
        int hashCOde=1000;
        int length=100;//bucket length
        System.out.println(hashCOde&(length-1));
        System.out.println(hashCOde%length);


        Map<String,String> hm=new HashMap<>(1000);
//        System.out.println(hm.);

//        m1();
    }

    private void m1(){
        throw new RuntimeException("Huu");
    }



}
