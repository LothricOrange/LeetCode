package com.math;

public class _812_最大三角形面积 {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int z = j + 1; z < points.length; z++) {
                    max = Math.max(max, returnS(points[i][0], points[i][1], points[j][0], points[j][1], points[z][0], points[z][1]));
                }
            }
        }
        return max / 2;
    }

    public double returnS(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
    }
}
