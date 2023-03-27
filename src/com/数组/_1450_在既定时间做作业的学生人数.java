package com.数组;

public class _1450_在既定时间做作业的学生人数 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (endTime[i] >= queryTime && startTime[i] <= queryTime) count++;
        }

        return count;
    }
}
