package com.数组;

public class _258_各位相加 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        for (int i = 0; i < 100; i++) {
            int res = 0;
            while (num > 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        return num;


    }
}
