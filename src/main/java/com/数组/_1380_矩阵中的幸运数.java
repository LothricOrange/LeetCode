package com.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1380_矩阵中的幸运数 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowMinArr = new int[row];
        int[] colMaxArr = new int[col];
        Arrays.fill(rowMinArr, Integer.MAX_VALUE);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = matrix[i][j];
                rowMinArr[i] = Math.min(val, rowMinArr[i]);
                colMaxArr[j] = Math.max(val, colMaxArr[j]);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = matrix[i][j];
                if (val == rowMinArr[i] && val == colMaxArr[j]) list.add(val);
            }
        }




        return list;
    }
}
