package com.字符串;

public class _1768_交替合并字符串 {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (chars1.length > chars2.length) {
            for (int i = 0; i < chars2.length; i++) {
                sb.append(chars1[i]).append(chars2[i]);
            }
            for (int i = chars2.length; i < chars1.length; i++) {
                sb.append(chars1[i]);
            }
        } else {
            for (int i = 0; i < chars1.length; i++) {
                sb.append(chars1[i]).append(chars2[i]);
            }
            for (int i = chars1.length; i < chars2.length; i++) {
                sb.append(chars2[i]);
            }
        }

        return sb.toString();
    }
}
