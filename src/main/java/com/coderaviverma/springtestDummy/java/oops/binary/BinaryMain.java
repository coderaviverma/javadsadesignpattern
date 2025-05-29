package com.coderaviverma.springtestDummy.java.oops.binary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryMain {

    public static void main(String[] args) {

//        System.out.println(20000>>>1);

//        int[] nums={9,8,7,6,5,4,3,2,1,0};
        int[] nums={8,1,2,2,3};
//        int[] temps=nums;
////        int[] temps=Arrays.copyOf(nums,nums.length);
//
//        Arrays.sort(temps);
//        Arrays.stream(temps).forEach(System.out::println);
//        System.out.println("==================");
//        Arrays.stream(nums).forEach(System.out::println);


        int[] results = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(results));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101];
        int[] result = new int[nums.length];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i < 101; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;

    }
}
