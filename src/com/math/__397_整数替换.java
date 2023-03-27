package com.math;

public class __397_整数替换 {
    public int integerReplacement(int num) {
        int count = 0;
        long n = (long) num;
        while (n != 1) {
            if ((n & 1) == 0) {
                n = n >> 1;
            } else {
                if ((((n >> 1) & 1) == 1) && n != 3) {
                    n++;
                } else {
                    n--;
                }
            }
            count++;
        }
        return count;
    }
}
