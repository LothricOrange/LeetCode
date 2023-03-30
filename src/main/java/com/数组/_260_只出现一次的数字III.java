package com.数组;

import java.util.HashMap;
import java.util.HashSet;

public class _260_只出现一次的数字III {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
            } else {
                set.remove(nums[i]);
            }
        }
        int index = 0;
        for (int num : set) {
            arr[index] = num;
            index++;
        }
        return arr;
    }
}
