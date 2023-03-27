package com.数组;

public class _905_按奇偶排序数组 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = nums.clone();
        for (int a : arr) {
            if ((a & 1) == 0) {
                nums[left] = a;
                left++;
            } else {
                nums[right] = a;
                right--;
            }
        }
        return nums;

    }
}
