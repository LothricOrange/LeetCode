package com.字符串;

public class _58_最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
