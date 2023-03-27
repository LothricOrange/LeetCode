package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _1078_Bigram分词 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strs = text.split(" ");
        int len = strs.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len - 2; i++) {
            if (first.equals(strs[i]) && second.equals(strs[i + 1])) {
                list.add(strs[i + 2]);
            }
        }

        String[] arr = list.toArray(new String[0]);
        return arr;
    }
}
