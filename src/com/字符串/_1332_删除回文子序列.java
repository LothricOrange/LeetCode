package com.字符串;

public class _1332_删除回文子序列 {
    public int removePalindromeSub(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
                continue;
            }
            return 2;


        }
        return 1;
    }
}
