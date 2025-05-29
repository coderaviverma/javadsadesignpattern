package com.coderaviverma.springtestDummy.java.dsa.recurssion;

import java.util.ArrayList;

public class SortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4};
//        System.out.println(sortedArray(arr, 0));

        System.out.println(findElement(arr, 0, 4, new ArrayList<>()));
    }

    public static boolean sortedArray(int[] arr, int index) {

        if (index == arr.length - 1) return true;

        return arr[index] < arr[index + 1] && sortedArray(arr, index + 1);
    }

    public static ArrayList findElement(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        return findElement(arr, index + 1, target, list);
    }
}
