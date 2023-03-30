package com.字符串;

public class _1668_最大重复子字符串 {
    public int maxRepeating(String sequence, String word) {
        char[] arr1 = sequence.toCharArray();
        char[] arr2 = word.toCharArray();
        int index = 0;
        int count = 0;
        int max = 0;
        while (index < arr1.length) {
            while (arr1[index] == arr2[0]) {
                index++;
                int i = 1;
                for (; i < arr2.length; i++) {
                    if (index == arr1.length || arr1[index] != arr2[i]) break;
                    index++;
                }
                if (i == arr2.length) count++;
            }
            max = Math.max(max, count);
            count = 0;
            index++;
        }
        return max;
        //return (sequence.length() - sequence.replace(word, "").length()) / word.length();
    }
}
