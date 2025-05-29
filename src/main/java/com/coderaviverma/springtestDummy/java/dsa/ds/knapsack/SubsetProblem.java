package com.coderaviverma.springtestDummy.java.dsa.ds.knapsack;

public class SubsetProblem {

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;

        System.out.println(topdownWay(arr, sum));

    }

    private static boolean topDownWay2(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] t = new boolean[n + 1][sum + 1];


        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        for (int i = 0; i <= sum; i++) {
            t[0][i] = false;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                if (arr[i-1]<=sum){
                    t[i][j]=t[i][j]|| t[i][j];
                }else {
                    t[i][j]=t[i][j];
                }

            }

        }


        return t[n][sum];
    }


    private static boolean topdownWay(int[] arr, int sum) {
        int n = arr.length;

        boolean[][] t = new boolean[sum + 1][n + 1];

        // Initialize: sum = 0 => true for all j
        for (int j = 0; j <= n; j++) {
            t[0][j] = true;
        }

        // sum != 0 but no elements => false
        for (int i = 1; i <= sum; i++) {
            t[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[j - 1] <= i) {
                    t[i][j] = t[i][j - 1] || t[i - arr[j - 1]][j - 1];
                } else {
                    t[i][j] = t[i][j - 1];
                }
            }
        }

        return t[sum][n];
    }

}
