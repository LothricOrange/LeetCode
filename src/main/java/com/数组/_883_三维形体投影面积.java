package com.数组;

public class _883_三维形体投影面积 {
    public int projectionArea(int[][] grid) {
        int r = 0;
        int[] arr = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    r++;
                    max = Math.max(max, grid[i][j]);
                    arr[j] = Math.max(arr[j], grid[i][j]);
                }
            }
            r += max;
        }
        for (int i : arr) {
            r += i;
        }
        return r;
    }
}
