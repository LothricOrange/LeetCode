package com.字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _438_找到字符串中所有字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) return list;

        HashSet<Character> set = new HashSet<>();
        int[] arr = new int[26];
        for (int i = 0; i < pLen; i++) {
            char c = p.charAt(i);
            set.add(c);
            arr[c - 'a'] += 1;
        }

        int begin = 0;
        while (begin <= sLen - pLen) {
            char c = s.charAt(begin);
            if (set.contains(c)) {
                int[] tmpArr = new int[26];
                int index = begin + pLen - 1;
                tmpArr[c - 'a'] += 1;
                while (index > begin) {
                    c = s.charAt(index);
                    tmpArr[c - 'a'] += 1;
                    index--;
                }
                if (Arrays.equals(tmpArr, arr)) list.add(begin);
            }

            begin++;
        }

        return list;
    }
}
