package com.coderaviverma.springtestDummy.java.dsa;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {

        int[] q={-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(q)));

    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0, end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }

}
