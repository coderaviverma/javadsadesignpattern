package com.coderaviverma.springtestDummy.java.dsa.ds.arrays;

import java.util.Arrays;

public class SearchMatrix {

    public static void main(String[] args) {

        int[][] nums={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(findInMatrix(nums,37)));
    }

    static int[] findInMatrix(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;

        while (r<matrix.length && c>=0){

            if (matrix[r][c]==target){
                return new int[]{r,c};
            }
            if (target > matrix[r][c]){
                r++;
            }else {
                c--;
            }

        }

        return new int[]{-1,-1};
    }
}
