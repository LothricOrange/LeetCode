package com.数组;

import java.util.HashMap;

public class _219_存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int oldIndex = map.get(nums[i]);
                if (i - oldIndex <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
