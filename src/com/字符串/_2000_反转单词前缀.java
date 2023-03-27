package com.字符串;

public class _2000_反转单词前缀 {
    public String reversePrefix(String word, char ch) {
        char prev = word.charAt(0);
        if (prev == ch) return word;
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                right = i;
                break;
            }
        }
        sb.append(word);
        while (left < right) {
            sb.setCharAt(left, word.charAt(right));
            sb.setCharAt(right, word.charAt(left));
            left++;
            right--;
        }

        return sb.toString();
    }
}
