package com.字符串;

public class _806_写字符串需要的行数 {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = {1, 0};
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int v = widths[c - 'a'];
            arr[1] += v;
            if (arr[1] > 100) {
                arr[1] = v;
                arr[0]++;
            }
        }
        return arr;
    }
}
