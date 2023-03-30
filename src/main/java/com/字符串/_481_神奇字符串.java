package com.字符串;

public class _481_神奇字符串 {
    public int magicalString(int n) {
        String s = "122";
        char c = '1';
        int i = 2, cnt = 1;
        while (s.length() < n) {
            s += c;
            cnt += (c == '1' ? 1 : 0);
            if (s.charAt(i) == '2' && s.length() < n) {
                // 如果 s[i] 是 2 那就多加一个 c
                // 如果 s.length() == n 时，不再统计
                s += c;
                cnt += (c == '1' ? 1 : 0);
            }
            i++;
            c ^= 3;
        }
        return cnt;
    }
}
