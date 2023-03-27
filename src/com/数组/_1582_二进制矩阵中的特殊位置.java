package com.数组;

public class _1582_二进制矩阵中的特殊位置 {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) ans++;
            }
        }

        return ans;
    }
}
