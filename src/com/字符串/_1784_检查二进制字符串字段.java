package com.字符串;

public class _1784_检查二进制字符串字段 {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                if (flag) return false;
                flag = true;
                i++;
                while (i < chars.length && chars[i] == '1') {
                    i++;
                }
            }
        }

        return true;
    }
}
