package com.数组;

public class 面试题01_08零矩阵 {
    public void setZeroes(int[][] matrix) {
        int[] arrX = new int[matrix.length];
        int[] arrY = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arrX[i] = 1;
                    arrY[j] = 1;
                }
            }
        }

        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == 1) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < arrY.length; j++) {
            if (arrY[j] == 1) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
