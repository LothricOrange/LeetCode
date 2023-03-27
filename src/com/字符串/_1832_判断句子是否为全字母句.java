package com.字符串;

public class _1832_判断句子是否为全字母句 {
    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        byte[] arr = new byte[26];
        for (char c : chars) {
            arr[c - 'a'] = 1;
        }
        for (byte a : arr) {
            if (a == 0) return false;
        }
        return true;
    }
}
