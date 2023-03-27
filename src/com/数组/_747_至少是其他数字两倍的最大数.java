package com.数组;

import java.util.Arrays;
import java.util.HashMap;

public class _747_至少是其他数字两倍的最大数 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int[] arr = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(arr);
        int index = arr.length - 1;
        if (arr[index] >= arr[index - 1] << 1) return map.get(arr[index]);
        return -1;
    }
}
