package com.字符串;

public class _1455_检查单词是否为句中其他单词的前缀 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith(searchWord)) return i + 1;
        }
        return 0;
    }
}
