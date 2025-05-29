package com.coderaviverma.springtestDummy.java.dsa.recurssion;

public class CountZero {

    public static void main(String[] args) {
        System.out.println(countZero(2000532,0));
    }

    public static int countZero(int val,int c){

        if (val==0){
            return c;
        }

        int rem=val%10;
        if (rem==0){
            return countZero(val/10,c+1);
        }

        return countZero(val/10,c);
    }
}
