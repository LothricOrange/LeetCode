package com.字符串;

public class _520_检测大写字母 {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) return true;
        char c0 = word.charAt(0);
        if (word.charAt(0) >= 'a') {
            for (int i = 1; i < len; i++) {
                char c = word.charAt(i);
                if (c < 'a') return false;
            }
        } else {
            char c1 = word.charAt(1);
            if (c1 >= 'a') {
                for (int i = 2; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (c < 'a') return false;
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (c >= 'a') return false;
                }
            }

        }
        return true;
    }
}
