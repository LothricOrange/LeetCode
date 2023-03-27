package com.数组;

public class _1217_玩筹码 {
    public int minCostToMoveChips(int[] position) {
        int res = 0;
        for (int a : position) {
            res += (a & 1);
        }
        int cmp = position.length - res;
        return cmp > res ? res : cmp;
    }

}
