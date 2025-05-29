package com.coderaviverma.springtestDummy.java.dsa.ds.knapsack;

class CountSubsetSum {

    public static void main(String[] args) {
        canPartition();
    }
    public static void canPartition() {
       int[] arrs={1,5,11,5};
        System.out.println(subSet(arrs,11));
    }

    static int subSet(int[] arr, int sum) {
        int n = arr.length;

        int[][] t = new int[sum + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            t[0][i] = 1;
        }

        for (int i = 0; i <= sum; i++) {
            t[i][0] = 0;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[j - 1] <= i) {
                    t[i][j] = t[i][j - 1] + t[i - arr[j - 1]][j - 1];
                } else {
                    t[i][j] = t[i][j - 1];
                }

            }
        }

        return t[sum][n];
    }
}