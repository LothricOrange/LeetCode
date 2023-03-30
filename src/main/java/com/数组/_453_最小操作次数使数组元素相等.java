package com.数组;

import java.util.Arrays;

public class _453_最小操作次数使数组元素相等 {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            count += nums[i] - minNum;
        }

        return count;
    }
}
