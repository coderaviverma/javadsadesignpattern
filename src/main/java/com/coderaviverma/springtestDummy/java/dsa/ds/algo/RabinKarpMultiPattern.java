package com.coderaviverma.springtestDummy.java.dsa.ds.algo;

import java.util.*;

public class RabinKarpMultiPattern {
    static final int d = 256; // ASCII base

    public static void searchPatterns(String text, List<String> patterns, int q) {
        Map<Integer, List<String>> patternMap = new HashMap<>();
        int maxLen = 0;

        // Preprocess: compute hash for each pattern and store in map
        for (String pat : patterns) {
            int hash = computeHash(pat, q);
            patternMap.computeIfAbsent(hash, k -> new ArrayList<>()).add(pat);
            maxLen = Math.max(maxLen, pat.length());
        }

        // Rolling hash window from size 1 up to max pattern length
        for (int len = 1; len <= maxLen; len++) {
            if (len > text.length()) break;

            int h = 1;
            for (int i = 0; i < len - 1; i++)
                h = (h * d) % q;

            int windowHash = computeHash(text.substring(0, len), q);

            for (int i = 0; i <= text.length() - len; i++) {
                if (patternMap.containsKey(windowHash)) {
                    String window = text.substring(i, i + len);
                    for (String pattern : patternMap.get(windowHash)) {
                        if (window.equals(pattern)) {
                            System.out.println("Pattern \"" + pattern + "\" found at index " + i);
                        }
                    }
                }

                // Slide the window
                if (i < text.length() - len) {
                    windowHash = (d * (windowHash - text.charAt(i) * h) + text.charAt(i + len)) % q;
                    if (windowHash < 0) windowHash += q;
                }
            }
        }
    }

    private static int computeHash(String str, int q) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (d * hash + str.charAt(i)) % q;
        }
        return hash;
    }

    public static void main(String[] args) {
        String text = "abccbaabcd";
        List<String> patterns = Arrays.asList("abc", "cba", "bca", "aabcd");
        int q = 101; // A large prime number to reduce collisions

        searchPatterns(text, patterns, q);
    }
}
