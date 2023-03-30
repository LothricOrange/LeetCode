package com.字符串;

public class _521_最长特殊序列I {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        int aLen = a.length();
        int bLen = b.length();
        return aLen > bLen ? aLen : bLen;
    }
}
