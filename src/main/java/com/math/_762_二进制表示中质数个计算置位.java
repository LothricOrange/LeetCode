package com.math;

public class _762_二进制表示中质数个计算置位 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while (left <= right) {
            count += 665772 >> Integer.bitCount(left) & 1;
            left++;
        }
        return count;
    }

}
