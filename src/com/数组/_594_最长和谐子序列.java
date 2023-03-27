package com.数组;

import java.util.Arrays;
import java.util.HashMap;

public class _594_最长和谐子序列 {
    public int findLHS(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            int num = map.get(key);
            if (map.containsKey(key + 1)) {
                max = Math.max(map.get(key + 1) + num, max);
            }
        }

        return max;
    }
}
