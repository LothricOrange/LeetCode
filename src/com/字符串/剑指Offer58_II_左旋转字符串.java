package com.字符串;
/**
 * ??
 * */
public class 剑指Offer58_II_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        /*String lose = Character.toString(s.charAt(n - 1));
        String[] strs = s.split(lose);
        return strs[1] + strs[0] + lose;*/
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb1.append(s.charAt(i));
        }
        for (int i = n; i < s.length(); i++) {
            sb2.append(s.charAt(i));
        }

        return sb2.append(sb1.toString()).toString();

    }
}
