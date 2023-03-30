package com.数组;

public class _598_范围求和II {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int xMin = m;
        int yMin = n;
        for (int i = 0; i < ops.length; i++) {
            xMin = Math.min(xMin, ops[i][0]);
            yMin = Math.min(yMin, ops[i][i]);
        }
        return xMin * yMin;
    }
}
