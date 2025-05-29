package com.coderaviverma.springtestDummy.java.dsa.ds.algo;

import java.util.Arrays;

public class KMP {

    public static void main(String[] args) {
        String s = "abxabcabcaby";
        String pattern = "abcaby";
        int[] ints = buildLps(pattern);

        kmp(s, pattern);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] buildLps(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    //this is to look backward so for D it will match with B at position 2 then len-1 it
                    // will match with A then it will set with 0 mean in current string this is not there
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }

        }

        return lps;
    }


    public static void kmp(String s, String p) {
        int[] lps = buildLps(p);

        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            }

            if (j == p.length()) {
                System.out.println("Index at - " + (i - j));
                j = lps[j - 1];//to start index
            } else if (i < s.length() && s.charAt(i) != p.charAt(j)) {
                //If not matching
                if (j != 0) {
                    //check for one previous
                    j = lps[j - 1];
                } else {
                    i++;
                }

            }


        }

    }
}
