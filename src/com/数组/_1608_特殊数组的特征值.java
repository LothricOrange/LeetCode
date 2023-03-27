package com.数组;

import java.util.Arrays;

public class _1608_特殊数组的特征值 {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            int cnt = 0;
            for(int num : nums) {
                if(num >= i) cnt++;
            }
            if(cnt == i) return i;
        }
        return -1;
    }
}
