package com.数组;

import java.util.HashSet;

public class _1748_唯一元素的和 {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setA.add(nums[i])) {
                sum += nums[i];
            } else {
                if (setB.add(nums[i])) sum -= nums[i];
            }
        }
        return sum;
    }

    public int sumOfUnique2(int[] nums) {
        int sum = 0;
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 0; i < 101; i++) {
            if (arr[i] == 1) sum += i;
        }
        return sum;
    }
}
