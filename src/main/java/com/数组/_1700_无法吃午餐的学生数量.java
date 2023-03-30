package com.数组;

public class _1700_无法吃午餐的学生数量 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        for (int stu : students) arr[stu]++;
        for (int sand : sandwiches) {
            if (arr[sand] > 1) arr[sand]--;
            else break;
        }

        return arr[0] + arr[1];
    }
}
