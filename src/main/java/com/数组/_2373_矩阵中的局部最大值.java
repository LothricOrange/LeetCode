package com.数组;

public class _2373_矩阵中的局部最大值 {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;
        int[][] arr = new int[n][n];
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int t = grid[i][j];
                for (int k = 0; k < 8; ++k)
                {
                    int x = i + dx[k], y = j + dy[k];
                    t = Math.max(t, grid[x][y]);
                }
                arr[i - 1][j - 1] = t;
            }
        }
        return arr;
    }

}
