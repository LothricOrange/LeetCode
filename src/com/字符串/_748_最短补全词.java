package com.字符串;


import java.util.Arrays;
import java.util.Comparator;

public class _748_最短补全词 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        char[] licArr = licensePlate.toLowerCase().toCharArray();
        int[] arr = new int[26];
        int count = 0;
        for (char c : licArr) {
            if (Character.isLowerCase(c)) {
                arr[c - 'a'] += 1;
                count++;
            }
        }

        for (String str : words) {
            int[] tmpArr = arr.clone();
            int tmpCount = 0;
            for (char c : str.toCharArray()) {
                int index = c - 'a';
                if (tmpArr[index] > 0) {
                    tmpArr[index] -= 1;
                    tmpCount++;
                }
            }
            if (tmpCount == count) return str;
        }

        return "CNM";
    }



}
