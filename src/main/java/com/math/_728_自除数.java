package com.math;

import java.util.ArrayList;
import java.util.List;

public class _728_自除数 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) list.add(i);
        }
        return list;
    }

    public boolean check(int n) {
        int tmp = n;
        while (tmp > 0) {
            int num = tmp % 10;
            if (num == 0 || n % num != 0) return false;
            tmp /= 10;
        }
        return true;
    }
}
