package com.coderaviverma.springtestDummy.java.dsa;

import java.util.ArrayList;

public class LongestMountain {

    public static void main(String[] args) {
        ArrayList<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(3);
        d.add(1);
        d.add(4);
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(9);
        d.add(8);
        d.add(7);
        d.add(6);
        d.add(5);
        System.out.println(LongestMountain(d));


    }

    public static int LongestMountain(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n < 3) // base condition for having the mountain
            return 0;
        int ans = 0;
        for (int i = 1; i <= n - 2; ) {
            if (arr.get(i) > arr.get(i - 1)
                && arr.get(i) > arr.get(i + 1)) {
                int count = 0;
                // now we find the index where a peak is
                // present
                int j = i;

                while (j > 0
                       && arr.get(j) > arr.get(j - 1)) {
                    count++;
                    j--;
                }
                while (i <= n - 2
                       && arr.get(i) > arr.get(i + 1)) {
                    count++;
                    i++;
                }
                ans = Math.max(ans, count);
            } else {
                i++;
            }
        }
        if (ans > 0)
            return ans + 1;
        return ans;
    }

}
