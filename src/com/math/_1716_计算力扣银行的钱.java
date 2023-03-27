package com.math;

public class _1716_计算力扣银行的钱 {
    public int totalMoney(int n) {
        int[] arr = new int[] {0, 1, 3, 6, 10, 15, 21, 28};
        int val = n / 7;
        if (val == 0) return arr[n];
        int mod = n % 7;
        return 28 * val + ((7 * (val - 1) * val) >> 1) + val * mod + arr[mod];
    }
}
