package com.coderaviverma.springtestDummy.java.dsa.ds.arrays;

class CoinChange {

    public static void main(String[] args) {

        int[] coin = {1, 2, 5};
        int amount = 56;

        System.out.println(coinChange(coin, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        //Iterate through amount
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {

                if ((i >= coins[j]) && (dp[i - coins[j]] != -1)) {
                    min = Math.min(min, dp[i - coins[j]]);
                }
            }
            if (min == Integer.MAX_VALUE) {
                dp[i] = -1;
            } else {
                dp[i] = min + 1;
            }
        }
        return dp[amount];
    }
}