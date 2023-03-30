package com.数组;

public class _1732_找到最高海拔 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i : gain) {
            sum += i;
            max = Math.max(sum, max);
        }
        return max;
    }
}
