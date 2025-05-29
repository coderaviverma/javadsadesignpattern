package com.coderaviverma.springtestDummy.java.dsa.recurssion;

public class FibanachiNumber {

    public static void main(String[] args) {

        System.out.println(nFibo(6));
    }

    public static int nFibo(int n){

        if (n<=1)return n;

        return nFibo(n-1)+nFibo(n-2);
    }
}
