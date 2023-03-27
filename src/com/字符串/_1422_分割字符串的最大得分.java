package com.字符串;

public class _1422_分割字符串的最大得分 {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int one = 0;
        for (char c : chars) {
            if (c == '1') one++;
        }
        int tmp = chars.length - 1;
        if (one == 0 || one == chars.length)  return tmp;
        int max = 0;
        int left = 0;
        int right = one;
        for (int i = 0; i < tmp; i++) {
            if (chars[i] == '0') {
                left++;
            } else {
                right--;
            }
            max = Math.max(max, left + right);
        }

        return max;
    }
}
