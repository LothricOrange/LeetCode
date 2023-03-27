package com.数组;

import java.util.Arrays;

public class _462_最少移动次数使数组元素相等II {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            ans += (nums[right] - nums[left]);
            right--;
            left++;
        }
        return ans;
    }
}
