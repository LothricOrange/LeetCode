package com.位运算;

public class _461_汉明距离 {
    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        String str = Integer.toBinaryString(num);
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
