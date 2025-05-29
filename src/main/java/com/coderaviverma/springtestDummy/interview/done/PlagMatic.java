package com.coderaviverma.springtestDummy.interview.done;

import java.util.HashSet;
import java.util.Set;

public class PlagMatic {


    /*
    * There is a circular list of non-zero integers called nums. Each number in the list tells you how many steps to move forward or backward from your current position:
        If nums[i] is positive, move nums[i] steps forward.
        If nums[i] is negative, move nums[i] steps backward.
        As the list is circular:
        Moving forward from the last element takes you back to the first element.
        Moving backward from the first element takes you to the last element.
        A cycle in this list means:
        You keep moving according to the numbers, and you end up repeating a sequence of indexes.
        All numbers in the cycle have the same sign (either all positive or all negative).
        The cycle length is greater than 1 (it involves at least two indexes).
        Return true if such a cycle exists in the list or false otherwise.
        Examples
        Inp: [3,1,2]
        Out: true

        Inp: [2,1,-1,-2]
        out: false


    * */
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2};
        int[] arr1 = {2, 1, -1, -2};
        int[] arr2 = {-2, -1, -1, -2};
        int[] arr3 = {-2, -1, -1, -2};
        int[] arr4 = {2, -1, 1, 2, 2};
        //ind=positive
        //return false

        //(arr.length% arr[i] ==i){
        //i++
        //cycle

        System.out.println(solve(arr1));
    }


    static boolean solve(int[] arr) {
        if (arr == null && arr.length == 0) {
            return false;
        }

        boolean cycle = false;
        int counter = 0;
        boolean isPositive = arr[0] > 0;
        for (int val : arr) {
            if (val < 0 && isPositive) {
                return false;
            } else if (!isPositive && val > 0) {
                return false;
            }
        }

        Set<Integer> postion = new HashSet<>();

//                int[] arr4 = {2, -1, 1, 2, 2};
        int i = 0;
        while (!cycle) {
            if (isPositive) {
                if (i < arr.length && arr.length % arr[i] == i) {
                    i++;
                }
                if (arr[i] > 0 && isPositive) {

                }
                i = i + arr[i];


                if (i >= arr.length - 1) {
                    i = i % arr.length;
                }
                postion.add(i);
                if (postion.contains(i)) {
                    return true;
                }

                if (counter > 1) {
                    cycle = true;
                    break;
                }
            } else {
                if (i >= 0 && i < arr.length && arr.length % Math.abs(arr[i]) == i) {
                    i++;
                }
                i = i + arr[i];
                if (i <= 0) {
                    i = arr.length + arr[i];
                    counter++;
                }

                if (counter > 2) {
                    cycle = true;
                    break;
                }

            }
        }

        return cycle;
    }


}

