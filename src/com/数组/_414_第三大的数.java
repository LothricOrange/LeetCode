package com.数组;



import java.util.Arrays;
/**
 ???????????????????????
 */
public class _414_第三大的数 {
    public int thirdMax(int[] nums) {
        int len = nums.length - 1;
        Arrays.sort(nums);
        if (len <= 2) {
            return nums[len];
        }
        return nums[2];
    }
}
