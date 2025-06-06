package com.coderaviverma.springtestDummy.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDiff {

    public static void main(String[] args) {

    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();

        int min=Integer.MAX_VALUE;
        for(int i =0 ;i<arr.length;i++){
            int diff=arr[i+1]-arr[i];

            if(diff<min){
                min=diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }

        }

        return res;
    }
}
