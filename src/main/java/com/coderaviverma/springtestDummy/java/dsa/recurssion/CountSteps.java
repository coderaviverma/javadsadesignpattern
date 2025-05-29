package com.coderaviverma.springtestDummy.java.dsa.recurssion;

public class CountSteps {
//    https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static void main(String[] args) {

        System.out.println(countStep(14));
    }

    public static int countStep(int steps){

        return helper(steps,0);
    }


    public static int helper(int num, int c){
        if(num==0){
            return c;
        }

        if(num%2==0){
            return helper(num/2,c+1);
        }

        return helper(num-1,c+1);
    }

}
