package com.数组;

public class _915_分割数组 {
    public int partitionDisjoint(int[] nums) {
        int leftMax = nums[0];
        int max = nums[0];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = max;
                res = i;
            }
        }
        return res;
    }
}
