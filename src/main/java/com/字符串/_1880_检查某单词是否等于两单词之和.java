package com.字符串;

public class _1880_检查某单词是否等于两单词之和 {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        char[] fChars = firstWord.toCharArray();
        char[] sChars = secondWord.toCharArray();
        char[] tChars = targetWord.toCharArray();
        for (int i = 0; i < fChars.length; i++) {
            fChars[i] = (char)(fChars[i] - 'a' + 48);
        }
        for (int i = 0; i < sChars.length; i++) {
            sChars[i] = (char)(sChars[i] - 'a' + 48);
        }
        for (int i = 0; i < tChars.length; i++) {
            tChars[i] = (char)(tChars[i] - 'a' + 48);
        }
        return Integer.parseInt(new String(fChars)) + Integer.parseInt(new String(sChars)) == Integer.parseInt(new String(tChars));
    }


    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));;
    }
}
