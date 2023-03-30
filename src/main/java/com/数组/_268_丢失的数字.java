package com.数组;

import java.util.HashSet;

public class _268_丢失的数字 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return ((nums.length * (nums.length + 1)) >> 1) - sum;
    }

    public int missingNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (set.add(i)) return i;
        }
        return nums[0];
    }
}
