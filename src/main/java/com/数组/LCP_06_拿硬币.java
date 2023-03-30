package com.数组;

public class LCP_06_拿硬币 {
    public int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            count += (coin + 1) >> 1;
        }
        return count;
    }
}
