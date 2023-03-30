package com.字符串;

import java.util.Arrays;

public class _899_有序队列 {
    public String orderlyQueue(String s, int k) {
        char[] arr = s.toCharArray();

        if (k > 1) {
            Arrays.sort(arr);
            return new String(arr);
        } else {
            StringBuilder sb = new StringBuilder();
            char min = arr[0];
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                } else if (arr[i] == min) {
                    int indexA = (minIndex + 1) % arr.length;
                    int indexB = (i + 1) % arr.length;
                    if (arr[indexA] > arr[indexB]) {
                        minIndex = i;
                    } else if (arr[indexA] == arr[indexB]) {
                        if (arr[(indexA + 1) % arr.length] > arr[(indexB + 1) % arr.length]) {
                            minIndex = i;
                        }
                    }
                }
            }
            for (int i = minIndex; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            for (int i = 0; i < minIndex; i++) {
                sb.append(arr[i]);
            }
            return sb.toString();
        }
    }
}
