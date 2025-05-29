package com.coderaviverma.springtestDummy.java.dsa.search;

public class FindFirstAndLast {

    public static void main(String[] args) {

        int[] ans=new int[2];
//        ans[0]=findFirstAndLast()

    }

    static int findFirstAndLast(int[] arr, int target, boolean findFirstIndex) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


}
