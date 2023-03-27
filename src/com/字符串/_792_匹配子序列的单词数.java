package com.字符串;

public class _792_匹配子序列的单词数 {
    public int numMatchingSubseq(String s, String[] words) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (String word : words) {
            char[] arr = word.toCharArray();
            int j = 0;
            for (int i = 0; i < chars.length; i++) {
                if (j == arr.length) {
                    count++;
                    break;
                }
                if (chars[i] == arr[j]) j++;
            }
        }

        return count;
    }


}
