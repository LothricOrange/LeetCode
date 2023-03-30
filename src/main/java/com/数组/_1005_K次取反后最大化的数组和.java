package com.数组;

import java.util.Arrays;

public class _1005_K次取反后最大化的数组和 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k > 0 && nums[i] < 0) {
                nums[i] = -nums[i];
                k -= 1;
            }
        }

        Arrays.sort(nums);

        for (int num : nums) {
            sum += num;
        }
        if (k > 0 && (k & 1) == 1) {
            sum -= (nums[0] << 1);
        }

        return sum;
    }
}
