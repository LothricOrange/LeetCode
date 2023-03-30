package com.其他;

public class _2006_差的绝对值为K的数对数目 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int length = nums.length;
        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                if (Math.abs(nums[i] - nums[j]) == k) count++;
            }
        }
        return count;
    }
}
