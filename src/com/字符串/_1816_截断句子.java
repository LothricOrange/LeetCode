package com.字符串;

public class _1816_截断句子 {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                k--;
            }
            if (k > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
