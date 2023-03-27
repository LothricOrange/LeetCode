package com.字符串;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _1763_最长的美好子字符串 {
        /*char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int left = 0, right = 1; right < chars.length; right++) {
            while (chars[left] == chars[right] ||
                chars[left] + 32 == chars[right] ||
                chars[right] + 32 == chars[left]) {
                right++;
            }
            int oldMax = max;
            max = Math.max(right - left, max);
            if (oldMax != max) {
                start = left;
            }
            left = right;
        }

        StringBuilder sb = new StringBuilder();
        while (start < max) {
            sb.append(chars[start]);
            start++;
        }
        return sb.toString();*/
        /*String ans = "";
        int len = s.length();
        for (int begin = 0; begin < len; begin++) {
            for (int end = begin + 1; end < len; end++) {
                String str = s.substring(begin, end);
                if (str.length() > ans.length() && check(str)) ans = str;
            }
        }


        return ans;
    }


    public boolean check(String s) {
        HashSet<Character> set1 = new HashSet(Collections.singleton(s.toCharArray()));
        HashSet<Character> set2 = new HashSet(Collections.singleton(s.toLowerCase().toCharArray()));
        return set1.size() == set2.size() << 1;
    }*/
        /*int n = s.length();
        for (int len = n; len >= 2; --len) {
            for (int i = 0; i <= n - len; ++i) {
                int up = 0, low = 0;
                for (int j = i; j < i + len; ++j) {
                    char c = s.charAt(j);
                    if (c >= 'A' && c <= 'Z') {
                        up |= 1 << (c - 'A');
                    } else {
                        low |= 1 << (c - 'a');
                    }
                }
                if ((up ^ low) == 0) return s.substring(i, len);
            }
        }
        return "";*/





    public String longestNiceSubstring2(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j - i + 1 > ans.length() && check(s.substring(i, j + 1))) ans = s.substring(i, j + 1);
            }
        }
        return ans;
    }

    boolean check(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        for (char c : s.toCharArray()) {
            char a = Character.toLowerCase(c), b = Character.toUpperCase(c);
            if (!set.contains(a) || !set.contains(b)) return false;
        }
        return true;
    }
}
