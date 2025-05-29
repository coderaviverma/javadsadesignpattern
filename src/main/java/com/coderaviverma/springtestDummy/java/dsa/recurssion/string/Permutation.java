package com.coderaviverma.springtestDummy.java.dsa.recurssion.string;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

//        permutation("", "abcd");

        System.out.println(permutationList("", "abcd"));

    }

    static void permutation(String res, String word) {
        if (word.isEmpty()) {
            System.out.println(res);
            return;
        }

        char c = word.charAt(0);

        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0, i);
            String s = res.substring(i, res.length());

            permutation(f + c + s, word.substring(1));
        }
    }


    static ArrayList<String> permutationList(String res, String word) {
        if (word.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        char c = word.charAt(0);

        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0, i);
            String s = res.substring(i, res.length());

            list.addAll(permutationList(f + c + s, word.substring(1)));
        }

        return list;
    }
}
