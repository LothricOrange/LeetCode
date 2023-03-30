package com.math;

public class _693_交替位二进制数 {

    public boolean hasAlternatingBits(int n) {
        int temp = n ^ (n >> 1);
        return (temp & (temp + 1)) == 0;
    }


    public static boolean hasAlternatingBits2(int n) {
        String number = Integer.toBinaryString(n);
        char[] chars = number.toCharArray();
        if (chars.length == 1) return true;
        char old = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (old == chars[i]) return false;
            old = chars[i];
        }
        return true;
    }

}
