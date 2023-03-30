package com.字符串;

public class _1790_仅执行一次字符串交换能否使两个字符串相等 {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int count = 0;
        int left = -1;
        int right = -1;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[i]) continue;
            if (count > 1) return false;
            count++;
            if (left == -1) {
                left = i;
            } else {
                right = i;
            }
        }

        if (left == -1) {
            return right == -1;
        } else {
            if (right == -1) return false;
        }
        return chars1[right] == chars2[left] && chars2[right] == chars1[left];
    }
}
