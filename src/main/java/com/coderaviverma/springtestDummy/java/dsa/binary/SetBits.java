package com.coderaviverma.springtestDummy.java.dsa.binary;

public class SetBits {

    public static void main(String[] args) {

        int n=123456;
        int count= 0;

        System.out.println(Integer.toBinaryString(n));
        //Count 1 bits
        while (n>0){
            count++;
            n=n&n-1;
        }

        System.out.println(count);

    }
}
