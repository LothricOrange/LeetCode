package com.数组;

import java.util.ArrayList;
import java.util.List;

public class _1260_二维网格迁移 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        /*List<List<Integer>> list = new ArrayList<>();
        int m = m;
        int n = n;

        while (k > 0) {
            k--;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                }
            }
        }
        return list;*/

        int m = grid.length;
        int n = grid[0].length;
        int[] nums = new int[m * n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                k %= nums.length;
                nums[k++] = grid[i][j];
            }
        }
        k = 0;
        List<List<Integer>> list = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> sList = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                sList.add(nums[k++]);
            }
            list.add(sList);
        }
        return list;
    }
}
