package com.字符串;

public class _777_在LR字符串中交换相邻字符 {
    public boolean canTransform(String start, String end) {
        char[] startChars = start.toCharArray();
        char[] endChars = end.toCharArray();
        if (startChars.length != endChars.length) return false;

        int i = 0;
        int j = 0;
        int len = startChars.length;
        while (true) {
            while (i < len && startChars[i] == 'X') {
                i++;
            }
            while (j < len && endChars[j] == 'X') {
                j++;
            }

            if (i == len && j == len) return true;
            if (i == len || j == len || startChars[i] != endChars[j]) return false;
            if (startChars[i] == 'L' && i < j || startChars[i] == 'R' && j < i ) {
                return false;
            }
            i++;
            j++;
        }

    }

}
