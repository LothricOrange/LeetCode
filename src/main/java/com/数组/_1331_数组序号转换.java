package com.数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1331_数组序号转换 {
    public int[] arrayRankTransform(int[] arr) {
        int[] cloneArr = arr.clone();
        int[] res = new int[arr.length];
        Arrays.sort(cloneArr);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < cloneArr.length; i++) {
            if (!map.containsKey(cloneArr[i])) {
                map.put(cloneArr[i], count);
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
