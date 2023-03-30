package com.数组;

public class _162_寻找峰值 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        }
        int index = 1;
        for (; index < nums.length - 1; index++) {
            if (nums[index - 1] < nums[index] && nums[index] > nums[index + 1]) {
                return index;
            }
        }
        if (nums[index] > nums[index - 1]) {
            return index;
        }
        return 0;
    }
}
