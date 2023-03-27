package com.数组;

import java.util.Arrays;

public class _1464_数组中两元素的最大乘积 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
