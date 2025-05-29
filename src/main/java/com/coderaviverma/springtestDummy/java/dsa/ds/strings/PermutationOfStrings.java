package com.coderaviverma.springtestDummy.java.dsa.ds.strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfStrings {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String a = "cat";
        helper(a.toCharArray(),0,result);

        System.out.println(result);
    }

   static void helper(char[] a, int i, List<String> res) {
        if (i == a.length) {
            res.add(new String(a));
        }

        for (int j = i; j < a.length; j++) {
            swap(a, j, i);
            helper(a, i + 1, res);
            swap(a, j, i);
        }

        //O(n*n!)
    }

    static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
