package com.字符串;

public class _921_使括号有效的最少添加 {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int stack = 0;
        int what = 0;
        for (char c : chars) {
            if (c == '(') {
                stack++;
            } else {
                if (stack > 0) {
                    stack--;
                } else {
                    what++;
                }
            }
        }

        return stack + what;
    }
}
