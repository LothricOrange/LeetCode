package com.字符串;

import java.util.Random;

public class _1576_替换所有的问号 {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = '0', next = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char c = next;
            if (i + 1 < s.length()) {
                next = s.charAt(i + 1);
            } else {
                next = '0';
            }
            if (c == '?') {
                c = 'a';
                if (prev == c) {
                    c = 'b';
                }

                if (next == c) {
                    c = 'c';
                    if (prev == c) {
                        c = 'd';
                    }
                }

            }
            sb.append(c);
            prev = c;
        }
        return sb.toString();
    }
}
