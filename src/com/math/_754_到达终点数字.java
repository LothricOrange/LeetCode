package com.math;

public class _754_到达终点数字 {
    public int reachNumber(int target) {
        if (target < 0) target = -target;
        int k = (int)Math.sqrt(target << 1);
        int dict = k * (k + 1) >> 1;
        while (dict < target || ((dict - target) & 1) == 1) {
            k++;
            dict = (k * (k + 1)) >> 1;
        }
        return k;
    }
}
