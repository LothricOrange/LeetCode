package com.math;

public class _1822_数组元素积的符号 {
    public int arraySign(int[] nums) {
        short count = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) count++;
        }
        return (count & 1) == 1 ? -1 : 1;
    }
}
