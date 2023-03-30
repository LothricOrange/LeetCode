package com.字符串;

import java.util.*;

//paragraph = paragraph.replace('!', ' ').replace('?', ' ').replace('\'', ' ').replace(',', ' ').replace(';', ' ').replace('.', ' ').trim();

public class _819_最常见的单词 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace('!', ' ').replace('?', ' ').replace('\'', ' ').replace(',', ' ').replace(';', ' ').replace('.', ' ').trim();
        String[] ps = paragraph.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        set.add("");
        for (String strB : banned) {
            set.add(strB);
        }

        for (String str : ps) {
            if (set.contains(str)) continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        String maxStr = null;
        int max = 0;
        for (String key : map.keySet()) {
            int v = map.get(key);
            if (v > max) {
                maxStr = key;
                max = v;
            }
        }

        return maxStr;
    }

    public String mostCommonWord2(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] ps = paragraph.split("[^a-zA-Z]+");

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (String strB : banned) {
            set.add(strB);
        }

        for (String str : ps) {
            if (set.contains(str)) continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        String maxStr = null;
        int max = 0;
        for (String key : map.keySet()) {
            int v = map.get(key);
            if (v > max) {
                maxStr = key;
                max = v;
            }
        }

        return maxStr;
    }
}
