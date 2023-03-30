package com.数组;

import java.util.Arrays;

public class _807_保持城市天际线 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int[] rowMax = new int[row];
        int[] colMax = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[i] = Math.max(colMax[i], grid[j][i]);
            }
        }

        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
