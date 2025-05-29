package com.coderaviverma.springtestDummy.java.dsa.recurssion;

import java.util.Arrays;
import java.util.Collections;

public class NQueens {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board,0);

    }


    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (isValid(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }

        }

        return 0;
    }

    static boolean isValid(boolean[][] board, int row, int col) {

        //check vertical
        for (int i = 0; i < row; i++) {
            if (board[row][col]) {
                return false;
            }
        }
        // Check Diagonal Left
        int min = Math.min(row, col);
        for (int i = 1; i <= min; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        //Check diagonal Right
        int max = Math.min(row, board.length-col-1);
        for (int i = 1; i <= max; i++) {
            if (board[row - 1][col + 1]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {

                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }
}
