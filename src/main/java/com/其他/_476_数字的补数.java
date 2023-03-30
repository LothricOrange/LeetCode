package com.其他;

public class _476_数字的补数 {
    public int findComplement(int num) {
        int temp = num;
        int a = 0;
        while (temp > 0) {
            temp = temp >> 1;
            a = (a << 1) + 1;
        }
        return num ^ a;
    }
}
