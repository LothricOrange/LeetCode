package com.哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _763_划分字母区间 {
    public List<Integer> partitionLabels(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }

        int start = 0, end = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            end = Math.max(end, map.get(chars[i]));
            if (end == i) {
                list.add(end - start + 1);
                start = i + 1;
            }
        }
        return list;
    }
}
