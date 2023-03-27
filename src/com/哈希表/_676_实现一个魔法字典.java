package com.哈希表;

import java.util.*;

public class _676_实现一个魔法字典 {
        Set<String> set;
        public _676_实现一个魔法字典() {
            set = new HashSet<>();
        }

        public void buildDict(String[] dictionary) {
            for (String str : dictionary) {
                set.add(str);
            }
        }

        public boolean search(String searchWord) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String str = it.next();
                if (str.length() != searchWord.length() || str.equals(searchWord)) continue;

                int count = 0;
                char[] chars = str.toCharArray();
                char[] words = searchWord.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == words[i]) continue;
                    count++;
                }
                if (count == 1) return true;
            }
            return false;
        }
}


class _676_实现一个魔法字典2 {

    Map<Integer, Set<String>> map;
    public _676_实现一个魔法字典2() {
        map = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String str : dictionary) {
            int len = str.length();
            Set<String> set;
            if (map.containsKey(len)) {
                set = map.get(len);
                set.add(str);
            } else {
                set = new HashSet<>();
            }
            map.put(len, set);
        }
    }

    public boolean search(String searchWord) {
        if (!map.containsKey(searchWord.length())) return false;
        Set<String> set = map.get(searchWord.length());
        for (String str : set) {
            int count = 0;
            char[] chars = str.toCharArray();
            char[] words = searchWord.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == words[i]) continue;
                count++;
            }
            if (count == 1) return true;
        }

        return false;
    }
}
