package com.字符串;

public class _2038_如果相邻两个颜色均相同则删除当前颜色 {
    public boolean winnerOfGame(String colors) {
        char[] chars = colors.toCharArray();
        int res = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            int index1 = i - 1;
            int index2 = i + 1;
            if (chars[index1] == 'A' && chars[i] == 'A' && chars[index2] == 'A') res++;
            if (chars[index1] == 'B' && chars[i] == 'B' && chars[index2] == 'B') res--;
        }

        return res > 0;
    }
}
