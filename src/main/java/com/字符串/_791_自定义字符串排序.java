package com.字符串;

public class _791_自定义字符串排序 {
    public String customSortString(String order, String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[26];
        for (char c : chars) arr[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (arr[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (arr[i]-- > 0) {
                sb.append((char)(i + 'a'));
            }
        }
        return sb.toString();
    }
}
