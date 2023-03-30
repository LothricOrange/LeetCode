package com.数组;

public class _1800_最大升序子数组和 {
    public int maxAscendingSum(int[] nums) {
        int old = nums[0];
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > old) {
                sum += nums[i];
                max = Math.max(sum, max);
            } else {
                sum = nums[i];
            }
            old = nums[i];
        }

        return max;
    }
}
