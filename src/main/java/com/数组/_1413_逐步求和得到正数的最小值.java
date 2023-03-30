package com.数组;

public class _1413_逐步求和得到正数的最小值 {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for (int a : nums) {
            sum += a;
            min = Math.min(sum, min);
        }
        return Math.abs(min) + 1;
    }
}
