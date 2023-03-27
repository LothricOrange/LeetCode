package com.数组;

import java.util.Arrays;

public class _561_数组拆分 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        int sum = 0;
        while (index < nums.length) {
            sum += nums[index];
            index += 2;
        }
        return sum;
    }
}
