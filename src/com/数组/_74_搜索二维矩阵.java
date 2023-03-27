package com.数组;

public class _74_搜索二维矩阵 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = matrix[0].length - 1;
        int right = 0;
        while (left >= 0 && right < matrix.length){
            if (matrix[right][left] < target) {
                right++;
            } else if (matrix[right][left] > target) {
                left--;
            } else {
                return true;
            }
        }
        return false;
    }
}
