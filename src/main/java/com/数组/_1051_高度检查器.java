package com.数组;

import java.util.Arrays;

public class _1051_高度检查器 {
    public int heightChecker(int[] heights) {
        int[] sort = heights.clone();
        int count = 0;
        Arrays.sort(sort);
        for (int i = 0; i < heights.length; i++) {
            if (sort[i] != heights[i]) count++;
        }
        return count;
    }
}
