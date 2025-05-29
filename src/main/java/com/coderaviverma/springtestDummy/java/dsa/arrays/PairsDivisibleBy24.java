package com.coderaviverma.springtestDummy.java.dsa.arrays;

public class PairsDivisibleBy24 {
    public static int countValidPairs(int[] arr) {
        int[] modCount = new int[24];
        for (int num : arr) {
            modCount[num % 24]++;
        }

        int count = 0;

        // Pair remainders r and (24 - r)
        for (int r = 1; r < 12; r++) {
            count += modCount[r] * modCount[24 - r];
        }

        // Handle remainder 0 (pairs within themselves)
        count += (modCount[0] * (modCount[0] - 1)) / 2;

        // Handle remainder 12 (pairs within themselves)
        count += (modCount[12] * (modCount[12] - 1)) / 2;

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1, 23, 47,12,12, 25, 28};
        System.out.println("Valid pairs: " + countValidPairs(arr));
    }
}