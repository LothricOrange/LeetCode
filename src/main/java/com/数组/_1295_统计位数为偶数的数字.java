package com.数组;

public class _1295_统计位数为偶数的数字 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 100000) {
                count++;
            } else if (nums[i] >= 10000) {

            } else if (nums[i] >= 1000) {
                count++;
            } else if (nums[i] >= 100) {

            } else if (nums[i] >= 10) {
                count++;
            } else {

            }
        }
        return count;
    }
}
