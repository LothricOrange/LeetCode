package com.字符串;

import java.util.Arrays;

public class _1374_生成每种字符都是奇数个的字符串 {
    public String generateTheString(int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        if ((n & 1) == 1) return new String(chars);
        chars[n - 1] = 'b';
        return new String(chars);
    }
}
