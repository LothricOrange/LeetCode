package com.字符串;

import java.util.Arrays;

public class _821_字符的最短距离 {
    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length];
        Arrays.fill(arr, chars.length + 5);
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j >= 0 && chars[j] != c) {
                j--;
            }
            if (j >= 0) {
                arr[i] = i - j;
            }
            j = i;
            while (j < chars.length && chars[j] != c) {
                j++;
            }
            if (j < chars.length) {
                arr[i] = Math.min(arr[i], j - i);
            }
        }
        return arr;
    }
}
