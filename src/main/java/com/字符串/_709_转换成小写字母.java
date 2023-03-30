package com.字符串;

public class _709_转换成小写字母 {
    public String toLowerCase(String s) {
        /*
        大写变小写、小写变大写 : 字符 ^= 32;

        大写变小写、小写变小写 : 字符 |= 32;

        小写变大写、大写变大写 : 字符 &= -33;
        * */
        return s.toLowerCase();
    }
}
