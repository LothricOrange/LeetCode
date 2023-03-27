package com.数组;

public class _495_提莫攻击 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int timeSum = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int cha = timeSeries[i + 1] - timeSeries[i];
            if (cha >= duration) {
                timeSum += duration;
            } else {
                timeSum += cha;
            }
        }
        return timeSum;
    }
}
