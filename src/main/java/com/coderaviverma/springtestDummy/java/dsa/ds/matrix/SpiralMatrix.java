package com.coderaviverma.springtestDummy.java.dsa.ds.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;

        while (top<=bottom && right>=left){
            //Top Row
            for (int i = top; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            //Right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top<=bottom) {
                //Bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left<=right){
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }

        return res;
    }
}
