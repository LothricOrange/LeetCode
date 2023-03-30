package com.哈希表;

import java.util.HashSet;
import java.util.Set;

public class _961_在长度2N的数组中找出重复N次的元素 {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return num;
        }
        return 0;
    }
}
