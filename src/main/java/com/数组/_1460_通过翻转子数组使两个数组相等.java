package com.数组;

import java.util.Arrays;

public class _1460_通过翻转子数组使两个数组相等 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
