package com.数组;

public class _1470_重新排列数组 {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[n << 1];
        for (int i = 0; i < n; i++) {
            newArr[i << 1] = nums[i];
            newArr[(i << 1) + 1] = nums[i + n];
        }
        return newArr;
    }
}
