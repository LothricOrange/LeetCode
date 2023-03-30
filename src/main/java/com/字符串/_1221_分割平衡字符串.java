package com.字符串;


public class _1221_分割平衡字符串 {


    public int balancedStringSplit(String s) {
        int number = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') n++;
            else n--;
            if (n == 0) number++;
        }
        return number;
    }
}
