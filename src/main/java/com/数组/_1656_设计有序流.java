package com.数组;

import java.util.ArrayList;
import java.util.List;

public class _1656_设计有序流 {
    String[] arr;
    int index = 1;
    public _1656_设计有序流(int n) {
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        List<String> ans = new ArrayList<>();
        arr[idKey] = value;
        while (index < arr.length && arr[index] != null) {
            ans.add(arr[index]);
            index++;
        }
        return ans;
    }
}
