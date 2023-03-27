package com.回溯;


import java.util.List;

public class _51_N皇后II {
    int[] cols;
    int count = 0;

    public List<List<String>> solveNQueens(int n) {
        cols = new int[n];
        MyQueen(0);
        System.out.println(count);
        return null;
    }

    public void MyQueen(int row) {
        if (row == cols.length) {
            count++;
            show();
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

    public void show() {
        for (int row = 0; row < cols.length; row++) {
            for (int col = 0; col < cols.length; col++) {
                if (cols[row] == col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}
