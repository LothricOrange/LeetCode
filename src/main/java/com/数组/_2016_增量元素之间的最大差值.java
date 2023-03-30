package com.数组;

public class _2016_增量元素之间的最大差值 {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j] - nums[i]);
            }
        }
        return max <= 0 ? -1 : max;
    }
}
