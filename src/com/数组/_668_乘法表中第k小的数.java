package com.数组;

import java.util.Arrays;

public class _668_乘法表中第k小的数 {
    public int findKthNumber(int m, int n, int k) {
        int arr[] = new int[m * n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[(i - 1) * m + j - 1] = i * j;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
