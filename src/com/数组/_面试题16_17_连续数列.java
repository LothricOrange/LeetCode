package com.数组;

public class _面试题16_17_连续数列 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i] + nums[i - 1];
            if (a > 0) {
                nums[i] = Math.max(nums[i], a);
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        return max;
    }
}
