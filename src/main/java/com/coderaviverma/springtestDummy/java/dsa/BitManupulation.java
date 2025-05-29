package com.coderaviverma.springtestDummy.java.dsa;

public class BitManupulation {

    public static void main(String[] args) {
        int[] q={2,1,3,5,2,1,3};
        singleNumber(q);

    }

    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }

        return xor;
    }
}
