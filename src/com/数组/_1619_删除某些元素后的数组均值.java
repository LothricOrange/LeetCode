package com.数组;

import java.util.Arrays;

public class _1619_删除某些元素后的数组均值 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int deta = arr.length / 20;
        for (int i = deta; i < arr.length - deta; i++) {
            sum += arr[i];
        }
        return sum / (arr.length * 0.9);
    }
}
