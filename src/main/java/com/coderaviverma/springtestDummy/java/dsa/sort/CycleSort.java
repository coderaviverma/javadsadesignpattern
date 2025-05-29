package com.coderaviverma.springtestDummy.java.dsa.sort;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int i=0;

        while (i<arr.length){
            int correct = arr[i];
            if (arr[i] != arr[correct-1]){
                swap(arr,i,correct-1);
            }else {
                i++;
            }

        }


    }

    static void swap(int[] arr, int first, int second) {
        int tem = arr[first];
        arr[first] = arr[second];
        arr[second] = tem;
    }
}
