package com.math;

public class _172_阶乘后的零 {
    public int trailingZeroes(int n) {
        int ans = 0;
        while ((n = n / 5) > 0) {
            ans += n;
        }
        return ans;
    }
}
