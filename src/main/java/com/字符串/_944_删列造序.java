package com.字符串;

public class _944_删列造序 {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        char[][] arr = new char[strs.length][strs[0].length()];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = strs[i].toCharArray();
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] < arr[i - 1][j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
