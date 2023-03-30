package com.math;

public class _908_最小差值I {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }
        int tmp = (k << 1);
        if (max - min <= tmp) return 0;
        return max - min - tmp;
    }
}
