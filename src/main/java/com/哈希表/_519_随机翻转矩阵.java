package com.哈希表;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _519_随机翻转矩阵 {
    int m;
    int n;
    Set<String> set;

    public _519_随机翻转矩阵(int m, int n) {
        this.m = m;
        this.n = n;
        set = new HashSet<>();

    }

    public int[] flip() {
        int mRand = new Random().nextInt(m);
        int nRand = new Random().nextInt(n);
        while (set.contains(mRand + "" + nRand)) {
            mRand = new Random().nextInt(m);
            nRand = new Random().nextInt(n);
        }
        set.add(mRand + "" + nRand);
        int[] arr = {mRand, nRand};
        return arr;
    }

    public void reset() {
        set.clear();
    }
}
