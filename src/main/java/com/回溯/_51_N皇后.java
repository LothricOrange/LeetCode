package com.回溯;


import java.util.ArrayList;
import java.util.List;

public class _51_N皇后 {
    int[] cols;
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        cols = new int[n];
        MyQueen(0);
        return list;
    }

    public void MyQueen(int row) {
        if (row == cols.length) {
            list.add(show());
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

    public List<String> show() {
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < cols.length; row++) {
            for (int col = 0; col < cols.length; col++) {
                if (cols[row] == col) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            stringList.add(sb.toString());
            sb = new StringBuilder();
        }
        return stringList;
    }
}
