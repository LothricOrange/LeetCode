package com.数组;

public class _2149_按符号重排数组 {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0, j = 1;
        for (int n : nums) {
            if (n < 0) {
                arr[j] = n;
                j += 2;
            } else {
                arr[i] = n;
                i += 2;
            }
        }
        return arr;
    }
}
