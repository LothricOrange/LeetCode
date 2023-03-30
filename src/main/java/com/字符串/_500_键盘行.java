package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _500_键盘行 {
    /*public String[] findWords(String[] words) {
        int[] arr = {1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2};
        StringBuilder sb = new StringBuilder();
        boolean add = true;
        for (String str : words) {
            char old = str.charAt(0);
            int oldIndex = str.charAt(0) < 'a' ? old - 'A' : old - 'a';
            for (int i = 0; i < str.length(); i++) {
                add = true;
                char c = str.charAt(i);
                int index = c < 'a' ? c - 'A' : c - 'a';
                if (c <= 'Z') {
                    c = (char)(c + 32);
                }
                if (arr[index] != arr[oldIndex]) {
                    add = false;
                    break;
                }
                oldIndex = index;
            }
            if (add) {
                sb.append(str + ",");
            }
        }
        String[] strs = sb.toString().split(",");
        *//*if (strs[0] == "") {
            strs = null;
        }*//*
        return strs;
    }*/


    public String[] findWords2(String[] words) {
        int[] arr = {1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2};
        List<String> list = new ArrayList<>();
        boolean add = true;
        for (String str : words) {
            char old = str.charAt(0);
            int oldIndex = str.charAt(0) < 'a' ? old - 'A' : old - 'a';
            for (int i = 0; i < str.length(); i++) {
                add = true;
                char c = str.charAt(i);
                int index = c < 'a' ? c - 'A' : c - 'a';
                if (arr[index] != arr[oldIndex]) {
                    add = false;
                    break;
                }
                oldIndex = index;
            }
            if (add) {
                list.add(str);
            }
        }

        return list.toArray(new String[0]);
    }
}
