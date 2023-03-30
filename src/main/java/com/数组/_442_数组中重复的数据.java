package com.数组;

import java.util.ArrayList;
import java.util.List;

public class _442_数组中重复的数据 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = Math.abs(nums[i]);
            int index = tmp - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                list.add(tmp);
            }
        }

        return list;
    }

    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) list.add(i);
        }

        return list;
    }
}
