package com.数组;

public class _540_有序数组中的单一元素 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if ((mid & 1) == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }

        }
        return nums[left];
    }
}
