package com.数组;

public class _1184_公交站间的距离 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < distance.length; i++) {
            if (start < destination) {
                if (i < start || i >= destination) {
                    left += distance[i];
                } else {
                    right += distance[i];
                }
            } else {
                if (i < destination || i >= start) {
                    left += distance[i];
                } else {
                    right += distance[i];
                }
            }
        }
        return left > right ? right : left;
    }
}
