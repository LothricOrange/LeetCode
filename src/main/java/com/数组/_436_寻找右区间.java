package com.数组;

import java.util.HashMap;

public class _436_寻找右区间 {
    public int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int right = intervals[i][1];
            HashMap<Integer, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < len; j++) {
                // if (j == i) continue;  [[1,1],[3,4]] -> [0,-1]
                int left = intervals[j][0];
                if (left >= right && left < min) {
                    min = Math.min(min, left);
                    map.put(left, j);
                } else {
                    continue;
                }
            }
            if (map.size() > 0) {
                result[i] = map.get(min);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
