package com.coderaviverma.springtestDummy.java.dsa.binary;

public class FindNoOfDigits {

    public static void main(String[] args) {

        int n=35676;
        int base= 10;

        int ans= (int) (Math.log(n)/Math.log(base))+1;
        System.out.println(ans);

        //find binary digits:

        int n1=10;
        int base1= 2;

        int ans2= (int) (Math.log(n1)/Math.log(base1))+1;
        System.out.println("Binary Number of digits "+ans2);
    }
}
