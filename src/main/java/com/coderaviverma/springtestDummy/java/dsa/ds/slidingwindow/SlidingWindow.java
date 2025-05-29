package com.coderaviverma.springtestDummy.java.dsa.ds.slidingwindow;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        slidingWindow(arr,k);
    }

    static int[] slidingWindow(int[] arr, int k) {

        int start = 0;
        int end = 0;
        int n = arr.length;
        int[] res=new int[n-k+1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (end = 0; end < n; end++) {

            if (end - start + 1 < k) {
                queue.add(arr[end]);
            } else if (end - start + 1 == k) {
                queue.add(arr[end]);
                res[start]=queue.peek();
                queue.remove(arr[start]);
                start++;
            }

        }

        return res;
    }
}
