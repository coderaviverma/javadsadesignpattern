package com.coderaviverma.springtestDummy.java.dsa.ds.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        map.computeIfAbsent("avi",k->new ArrayList<>()).add("");

        new ArrayList<>(map.values());

    }
}
