package com.数组;

import java.util.*;

public class _229_求众数II {
    /*public List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0) return null;
        List<Integer> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        Arrays.sort(nums);
        int count = 1;
        int num = nums.length / 3;
        int val;
        for (int i = 0; i < nums.length; i++) {
            val = i + 1 == nums.length ? -10086 : nums[i + 1];
            if (nums[i] == val) count++;
            if (count > num) {
                list.add(nums[i]);
            }
            count = 1;
        }
        return list;
    }*/
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int num = nums.length / 3;
        for (int i : map.keySet()) {
            if (map.get(i) > num) {
                list.add(i);
            }
        }

        return list;
    }
}
