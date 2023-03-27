package com.数组;

public class _2022_将一维数组转变成二维数组 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr;
        int[][] other = new int[0][0];
        if (original.length != m * n) return other;
        arr = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index];
                index++;
            }
        }
        return arr;
    }
}
