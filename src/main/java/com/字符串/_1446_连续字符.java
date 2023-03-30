package com.字符串;

public class _1446_连续字符 {
    public int maxPower(String s) {
        int len = s.length();
        if (len == 0) return 0;
        char old = s.charAt(0);
        int max = 1;
        int count = 1;
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            if (c == old) {
                count += 1;
            } else {
                max = Math.max(count, max);
                count = 1;
                old = c;
            }

        }
        max = Math.max(count, max);
        return max;
    }
}
