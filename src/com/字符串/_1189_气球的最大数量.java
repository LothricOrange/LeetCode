package com.字符串;

public class _1189_气球的最大数量 {
    public int maxNumberOfBalloons(String text) {
        char[] chars = text.toCharArray();
        int[] arr = new int[26];
        for (char c : chars) {
            arr[c - 'a'] += 1;
        }
        // 1a + 1b + 2l + 1n + 2o
        if (arr[0] > 0 && arr[1] > 0 && arr[11] > 1 && arr[13] > 0 && arr[14] > 1) {
            int min = arr[0];
            min = Math.min(min, arr[1]);
            min = Math.min(min, (arr[11] >> 1));
            min = Math.min(min, arr[13]);
            min = Math.min(min, (arr[14] >> 1));
            return min;
        }

        return 0;
    }
}
