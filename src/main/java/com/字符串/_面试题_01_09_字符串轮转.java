package com.字符串;

public class _面试题_01_09_字符串轮转 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        s2 += s2;
        return s2.contains(s1);
    }
}
