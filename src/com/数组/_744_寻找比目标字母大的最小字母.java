package com.数组;

public class _744_寻找比目标字母大的最小字母 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) return c;
        }
        return letters[0];
    }
}
