package com.数组;

import java.util.Arrays;
import java.util.HashMap;

public class _496_下一个更大元素I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1];
        for (int i = 0; i < len1; i++) {
            int j = 0;
            while (j < len2 && nums1[i] != nums2[j]) {
                j++;
            }
            while (j < len2 && nums1[i] >= nums2[j]) {
                j++;
            }
            arr[i] = j == len2 ? -1 : nums2[j];
        }
        return arr;
    }
}
