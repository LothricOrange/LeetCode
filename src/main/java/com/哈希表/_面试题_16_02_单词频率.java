package com.哈希表;

import java.util.HashMap;
import java.util.Map;

public class _面试题_16_02_单词频率 {
    Map<String, Integer> map;
    public _面试题_16_02_单词频率(String[] book) {
        map = new HashMap<>();
        for (String str : book) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
    }

    public int get(String word) {
        Integer res = map.get(word);
        return res == null ? 0 : res;
    }
}
