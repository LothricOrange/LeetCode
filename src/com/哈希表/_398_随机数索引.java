package com.哈希表;

import java.util.*;

public class _398_随机数索引 {
    Map<Integer, List<Integer>> map;

    public _398_随机数索引(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.get(nums[i]);
            if (list == null) {
                list = new ArrayList<>();
                map.put(nums[i], list);
            }
            list.add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        Random rd = new Random();
        int rand = rd.nextInt(list.size());
        return list.get(rand);
    }
}
