package com.数组;

public class _997_找到小镇的法官 {
    public int findJudge(int n, int[][] trust) {
        int[] outArr = new int[n + 1];
        int[] inArr = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            outArr[trust[i][0]] += 1;
            inArr[trust[i][1]] += 1;
        }

        for (int i = 1; i <= n; i++) {
            if (outArr[i] == 0 && inArr[i] == n -1) {
                return i;
            }

        }
        return -1;
    }
}
