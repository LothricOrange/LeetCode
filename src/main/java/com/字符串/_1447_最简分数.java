package com.字符串;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _1447_最简分数 {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();

        for (int mum = 2; mum <= n; mum++) {
            for (int son = 1; son < mum; son++) {
                if (gcd(mum, son) == 1) {
                    list.add(son + "/" + mum);
                }
            }
        }

        return list;
    }

    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public int gcd2(int a, int b) {
        if (a % b == 0) return b;
        return gcd2(b, a % b);
    }
}
