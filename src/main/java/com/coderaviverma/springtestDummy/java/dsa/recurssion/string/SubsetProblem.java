package com.coderaviverma.springtestDummy.java.dsa.recurssion.string;

import java.util.ArrayList;
import java.util.List;

public class SubsetProblem {

    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseq2("", "abc"));
    }


    static void subseq(String res, String word) {

        if (word.isEmpty()) {
            System.out.println(res);
            return;
        }
        char c = word.charAt(0);
        subseq(res + c, word.substring(1));
        subseq(res, word.substring(1));
    }

    static ArrayList<String> subseq2(String res,String word){

        if (word.isEmpty()){
            ArrayList list=new ArrayList();
            list.add(res);
            return list;
        }

        char ch=word.charAt(0);
        ArrayList left=subseq2(res,word.substring(1));
        ArrayList right = subseq2(res+ch,word.substring(1));

        left.addAll(right);

        return left;

    }

}
