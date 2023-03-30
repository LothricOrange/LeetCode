package com.字符串;

public class _2027_转换字符串的最少操作次数 {
    public int minimumMoves(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'O') continue;
            i += 2;
            count++;
        }
        return count;
    }
}
