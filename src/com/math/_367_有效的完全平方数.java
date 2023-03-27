package com.math;

public class _367_有效的完全平方数 {
    public boolean isPerfectSquare(int num) {
        int value = (int) Math.sqrt(num);
        if (value * value == num) return true;
        return false;
    }
}
