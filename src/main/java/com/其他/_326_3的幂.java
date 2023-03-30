package com.其他;

import java.math.BigDecimal;

public class _326_3的幂 {
    public static boolean isPowerOfThree(int n) {
        /*double number = Math.log(n) / Math.log(3);
        return number == (int)number;*/ //精度丢失
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public int sumNums(int n) {
        return (n * (n + 1)) >> 1;
    }
}
