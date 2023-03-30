package com.字符串;

import java.util.Arrays;
import java.util.Comparator;

public class _937_重新排列日志文件 {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String id1, id2, c1, c2;
            boolean isNum1 = false;
            boolean isNum2 = false;
            int len1 = log1.length();
            int len2 = log2.length();
            int t = 0;
            while (t < len1 && log1.charAt(t) != ' ') {
                t++;
            }
            id1 = log1.substring(0, t);
            c1 = log1.substring(t, len1);
            isNum1 = log1.charAt(t + 1) >= '0' && log1.charAt(t + 1) <= '9';
            t = 0;
            while (t < len2 && log2.charAt(t) != ' ') {
                t++;
            }
            id2 = log2.substring(0, t);
            c2 = log2.substring(t, len2);
            isNum2 = log2.charAt(t + 1) >= '0' && log2.charAt(t + 1) <= '9';
            if (isNum1 != isNum2) {
                if (isNum1) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (isNum1) {
                return 0;
            } else {
                if (c1.equals(c2)) {
                    return id1.compareTo(id2);
                } else {
                    return c1.compareTo(c2);
                }
            }
        });
        return logs;
    }
}
