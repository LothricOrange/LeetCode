package com.数组;

public class _1572_矩阵对角线元素的和 {
    public int diagonalSum(int[][] mat) {
        int left = 0;
        int right = mat[0].length - 1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][left] + mat[i][right];
            left++;
            right--;
        }
        if ((mat.length & 1) == 1) {
            int index = mat.length >> 1;
            sum -= mat[index][index];
        }
        return sum;
    }
}
