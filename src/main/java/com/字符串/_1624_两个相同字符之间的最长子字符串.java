package com.字符串;

import java.util.Arrays;

public class _1624_两个相同字符之间的最长子字符串 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        char[] chars = s.toCharArray();
        int[] dis = new int[26];
        Arrays.fill(dis, -1);
        for (int i = 0; i < 26; i++) {
            for (int j = chars.length - 1; j >= i + 1; j--) {
                if (chars[j] == chars[i]) {
                    dis[i] = j - i - 1;
                    break;
                }
            }
        }
        for (int di : dis) {
            ans = Math.max(ans, di);
        }
        return ans;
    }
}
