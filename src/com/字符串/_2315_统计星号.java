package com.字符串;

public class _2315_统计星号 {
    public int countAsterisks(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        boolean flag = true;
        for (char c : chars) {
            if (c == '|') flag = !flag;
            if (flag && c == '*') count++;
        }
        return count;
    }
}
