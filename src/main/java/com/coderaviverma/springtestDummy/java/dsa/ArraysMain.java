package com.coderaviverma.springtestDummy.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            res.add(i);
        }

        int[] resInt=new int[10];
        List<Integer> integers = res.subList(0, 10);
//        integers.toArray(new int[]);

    }
}
