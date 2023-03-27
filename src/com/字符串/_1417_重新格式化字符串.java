package com.字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1417_重新格式化字符串 {
    public String reformat(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (arr[i] > '9' || arr[j] < 'a') return "";
            sb.append(arr[i]);
            sb.append(arr[j]);
        }
        
        if ((len & 1) == 1) {
            int index = len >> 1;
            if (arr[index] > '9') {
                sb.insert(0, arr[index]);
            } else {
                sb.append(arr[index]);
            }
        }
        return sb.toString();
    }
}
