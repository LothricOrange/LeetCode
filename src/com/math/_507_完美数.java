package com.math;

public class _507_完美数 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int temp = 2;
        int sum = 1;
        int a;
        while ((a = num / temp) > 1) {
            if (num == a * temp) {
                sum += temp;
            }
            temp++;
        }
        return sum == num;
    }
}
