package com.coderaviverma.springtestDummy.java.dsa.maths;

public class Prime {

    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        sieve(n,primes);
    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {

            if (!primes[i]) {
                //multiple by 2 as leave first number as prime like 2,3, 5, 7 then add i to j as 6+3, 9+3
                for (int j = i * 2; j <= n; j+=i) {
                    primes[j]=true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
