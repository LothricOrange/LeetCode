package com.math;

public class _2028_找出缺失的观测数据 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int rollSum = 0;
        for (int roll : rolls) {
            rollSum += roll;
        }
        int need = mean * (rolls.length + n) - rollSum;

        if (need > n * 6 || need < n) return new int[0];

        int[] arr = new int[n];

        int a = need / n;
        int b = need % n;
        for (int i = 0; i < n; i++) {
            if (b > 0) {
                arr[i] = a + 1;
                b--;
            } else {
                arr[i] = a;
            }

        }

        return arr;
    }
}
