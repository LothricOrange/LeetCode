package com.数组;

import java.util.Arrays;

public class _324_摆动排序II {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if ((i & 1) == 1) {
                nums[i] = arr[right];
                right--;
            } else {
                nums[i] = arr[left];
                left++;
            }
        }
    }
}
