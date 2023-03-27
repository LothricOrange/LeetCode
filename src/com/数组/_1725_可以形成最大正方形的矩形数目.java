package com.数组;

public class _1725_可以形成最大正方形的矩形数目 {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rectangles.length; i++) {
            int temp = Math.min(rectangles[i][0], rectangles[i][1]);
            if (max < temp) {
                max = temp;
                count = 0;
            } else if (max == temp) {
                count++;
            }
        }
        return count;
    }
}
