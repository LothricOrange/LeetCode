package com.数组;

public class _713_乘积小于K的子数组 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) continue;
            int tmp = nums[i];
            int index = i + 1;
            while (tmp < k) {
                if (index < nums.length) {
                    tmp = tmp * nums[index];
                    index++;
                    count++;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
