package com.回溯;


import java.util.List;

public class _51_N皇后III {
    int[] cols;
    int count = 0;

    public int totalNQueens(int n) {
        cols = new int[n];
        MyQueen(0);
        return count;
    }

    public void MyQueen(int row) {
        if (row == cols.length) {
            count++;
            return;
        }

        for (int col = 0; col < cols.length; col++) {
            if (isLegal(row, col)) {
                cols[row] = col;
                MyQueen(row + 1);
            }
        }
    }

    public boolean isLegal(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (cols[i] == col) return false;
            if (row - i == Math.abs(cols[i] - col)) return false;
        }
        return true;
    }

}
