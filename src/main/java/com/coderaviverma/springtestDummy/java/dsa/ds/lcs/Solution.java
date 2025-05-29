package com.coderaviverma.springtestDummy.java.dsa.ds.lcs;

class Solution {

    public static void main(String[] args) {

        String a="abcde";
        String b="ace";
        Solution solution=new Solution();
        solution.longestCommonSubsequence(a,b);

    }
    public int longestCommonSubsequence(String text1, String text2) {


        int m = text1.length();
        int n = text2.length();

        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                t[i][j] = -1;
            }
        }

        return topdownlcs(text1.toCharArray(), text2.toCharArray(), m, n);
        // return lcs(text1.toCharArray(), text2.toCharArray(),m,n,t);
    }

    int lcs(char[] text1, char[] text2, int m, int n, int[][] t) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (t[m][n] != -1) {
            return t[m][n];
        }

        if (text1[m - 1] == text2[n - 1]) {
            return t[m][n] = 1 + lcs(text1, text2, m - 1, n - 1, t);
        } else {
            return t[m][n] = Math.max(lcs(text1, text2, m - 1, n, t), lcs(text1, text2, m, n - 1, t));
        }
    }

    int topdownlcs(char[] text1, char[] text2, int m, int n) {

        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            t[i][0] = 0;
        }

        for (int j = 0; j <= n; j++) {
            t[0][j] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (text1[i - 1] == text2[j - 1]) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j-1]);
                }

            }
        }

        return t[m][n];
    }

}