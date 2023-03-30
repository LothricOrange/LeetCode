package com.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1403_非递增顺序的最小子序列 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int limit = sum >> 1;
        int num = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            num += nums[i];
            if (num < limit) {
                list.add(nums[i]);
            }
        }

        return list;
    }
}
