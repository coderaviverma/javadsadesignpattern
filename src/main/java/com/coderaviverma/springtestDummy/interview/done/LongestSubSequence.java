package com.coderaviverma.springtestDummy.interview.done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubSequence {

    public static void main(String[] args) {

        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(longestSubSeQ(nums));
    }

    private static int longestSubSeQ(int[] nums){
        List<Integer> sub = new ArrayList<>();
        for (int num : nums) {
            int i = Collections.binarySearch(sub, num);
            if (i < 0)
                i = -(i + 1);
            if (i < sub.size())
                sub.set(i, num);
            else
                sub.add(num);
        }
        return sub.size();
    }
}
