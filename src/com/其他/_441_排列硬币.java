package com.其他;

public class _441_排列硬币 {
    public int arrangeCoins(int n) {
        int temp = 1;
        int count = 0;
        while ((n = n - temp) >= 0) {
            count++;
            temp++;
        }
        return count;
    }
}
