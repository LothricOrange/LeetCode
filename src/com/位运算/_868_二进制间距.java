package com.位运算;

public class _868_二进制间距 {
    public int binaryGap(int n) {
        int count = 0;
        int max = 0;
        int prev = -1;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (prev != -1) max = Math.max(max, count - prev);
                prev = count;
            }
            n >>= 1;
            count++;
        }

        return max;
    }
}
