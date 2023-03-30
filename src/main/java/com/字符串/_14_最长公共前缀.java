package com.字符串;

public class _14_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str)) {
                int len = str.length();
                if (len == 0) return "";
                str = str.substring(0, len - 1);
            }
        }
        return str;
    }
}
