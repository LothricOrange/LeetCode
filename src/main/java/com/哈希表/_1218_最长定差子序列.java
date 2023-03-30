package com.哈希表;

import java.util.HashMap;


public class _1218_最长定差子序列 {
    public int longestSubsequence(int[] arr, int difference) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            Integer num = map.get(arr[i] - difference);
            if (num != null) {
                int tmp = num + 1;
                map.put(arr[i], tmp);
                max = Math.max(tmp, max);
            } else {
                map.put(arr[i], 1);
            }
        }

        return max;
    }
}
