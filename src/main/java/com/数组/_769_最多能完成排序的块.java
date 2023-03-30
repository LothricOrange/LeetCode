package com.数组;

public class _769_最多能完成排序的块 {
    public int maxChunksToSorted(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) count++;
        }

        return count;
    }
}
