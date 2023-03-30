package com.数组;

import java.util.Arrays;

public class _1913_两个数对之间的最大乘积差 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int index = len - 1;
        if (len <= 2) return 0;
        return nums[index] * nums[index - 1] - nums[0] * nums[1];
    }
}
