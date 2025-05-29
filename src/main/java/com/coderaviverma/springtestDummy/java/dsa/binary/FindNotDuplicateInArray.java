package com.coderaviverma.springtestDummy.java.dsa.binary;

public class FindNotDuplicateInArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,4,3,2,1};

        System.out.println(findNonDuplicate(arr));
    }

    private static int findNonDuplicate(int[] arr) {
        int unique=0;

        for(int a:arr){
            unique=unique^a;}

        return unique;
    }
}
