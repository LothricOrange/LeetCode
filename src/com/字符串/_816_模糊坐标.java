package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _816_模糊坐标 {
    String str;
    public List<String> ambiguousCoordinates(String s) {
        str = s.substring(1, s.length() - 1);
        int n = str.length();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            List<String> a = search(0, i), b = search(i + 1, n - 1);
            for (String x : a) {
                for (String y : b) {
                    ans.add("(" + x + ", " + y + ")");
                }
            }
        }
        return ans;

    }
    List<String> search(int start, int end) {
        List<String> ans = new ArrayList<>();
        if (start == end || str.charAt(start) != '0') ans.add(str.substring(start, end + 1));
        for (int i = start; i < end; i++) {
            String a = str.substring(start, i + 1), b = str.substring(i + 1, end + 1);
            if (a.length() > 1 && a.charAt(0) == '0') continue;
            if (b.charAt(b.length() - 1) == '0') continue;
            ans.add(a + "." + b);
        }
        return ans;
    }
}
