package com.coderaviverma.springtestDummy.java.dsa.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {

    public static void main(String[] args) {

//        pad("","23");
//        System.out.println(padList("","12"));

        padList("23");
    }


    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit=up.charAt(0) -'0';

        for (int i = (digit-1)*3; i < (digit *3); i++) {
            char ch= (char) ('a' + i);
            pad(ch+p,up.substring(1));
        }
    }


    static List<String> padList(String p, String up){
        if (up.isEmpty()){
           List<String> res=new ArrayList<>();
            res.add(p);
           return res;
        }

        int digit=up.charAt(0) -'0';
        List<String> res=new ArrayList<>();

        for (int i = (digit-1)*3; i < (digit *3); i++) {
            char ch= (char) ('a' + i);
            res.addAll( padList(p+ch,up.substring(1)));
        }
        return res;
    }




    // Precomputed character mappings for digits (assuming '1' is mapped to "abc", '2' -> "def", etc.)
    private static final String[] KEYPAD = {
            "",    "",    "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> padList(String up) {
        List<String> res = new ArrayList<>();
        if (up.isEmpty()) return res; // Edge case: Empty input

        backtrack(res, new StringBuilder(), up, 0);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder sb, String up, int index) {
        if (index == up.length()) {
            res.add(sb.toString());
            return;
        }

        int digit = up.charAt(index) - '0'; // Convert char to digit
        if (digit < 2 || digit > 9) return; // Ignore invalid digits (0,1)

        String letters = KEYPAD[digit]; // Get corresponding letters
        for (char ch : letters.toCharArray()) {
            sb.append(ch);            // Add character
            backtrack(res, sb, up, index + 1); // Recur for next index
            sb.deleteCharAt(sb.length() - 1); // Undo (backtrack)
        }
    }

}
