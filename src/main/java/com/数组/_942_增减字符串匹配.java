package com.数组;

public class _942_增减字符串匹配 {
    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length + 1];

        int left = 0;
        int right = chars.length;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                arr[i] = left;
                left++;
            } else {
                arr[i] = right;
                right--;
            }
        }

        if (chars[chars.length - 1] == 'I') {
            arr[chars.length] = left;
        } else {
            arr[chars.length] = right;
        }

        return arr;
    }
}
