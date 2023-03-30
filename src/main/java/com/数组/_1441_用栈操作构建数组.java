package com.数组;

import java.util.ArrayList;
import java.util.List;

public class _1441_用栈操作构建数组 {
    public List<String> buildArray(int[] target, int n) {
        int index = 0;
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (index == target.length) break;
            if (target[index] == i) {
                list.add("push");
                index++;
            } else {
                list.add("push");
                list.add("pop");
            }

        }
        return list;
    }
}
