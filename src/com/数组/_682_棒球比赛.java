package com.数组;

public class _682_棒球比赛 {
    public int calPoints(String[] ops) {
        int[] arr = new int[ops.length];
        int index = 0;
        for (String str : ops) {
            if (str.equals("+")) {
                arr[index] = arr[index - 1] + arr[index - 2];
                index++;
            } else if (str.equals("C")) {
                arr[index - 1] = 0;
                index--;
            } else if (str.equals("D")) {
                arr[index] = (arr[index - 1] << 1);
                index++;
            } else {
                arr[index] = Integer.parseInt(str);
                index++;
            }
        }
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }

        return sum;
    }
}
