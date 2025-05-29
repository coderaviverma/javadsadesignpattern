package com.coderaviverma.springtestDummy.java.dsa.recurssion.string;

public class RemoveAllALetter {

    public static void main(String[] args) {

//        removeLetter("","baccaad");

        System.out.println(removeLetter2("baccaad"));
    }

    static void removeLetter(String up,String word){
        if (word.isEmpty()){
            System.out.println(up);
            return;
        }
        char c = word.charAt(0);
        if ('a'==c){
            removeLetter(up,word.substring(1));
        }else {
            removeLetter(up+c,word.substring(1));
        }

    }

    static String removeLetter2(String word){
        if (word.isEmpty()){
            return "";
        }
        char c = word.charAt(0);
        if ('a'==c){
           return removeLetter2(word.substring(1));
        }else {
           return c+ removeLetter2(word.substring(1));
        }

    }
}
