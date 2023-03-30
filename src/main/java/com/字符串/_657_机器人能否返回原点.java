package com.字符串;

public class _657_机器人能否返回原点 {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[4];
        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if (c == 'U') {
                arr[0]++;
            } else if (c == 'D') {
                arr[1]++;
            } else if (c == 'L') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        return arr[0] == arr[1] && arr[2] == arr[3];
    }
}
