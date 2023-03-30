package com.字符串;

public class _824_山羊拉丁文 {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] strs = sentence.split(" ");
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < strs.length; i++) {
            sb.append(vowel.indexOf(strs[i].charAt(0)) == -1 ? strs[i].substring(1) + strs[i].charAt(0) + "ma"
                    : strs[i] + "ma");
            for (int j = 0; j < i + 1; j++)
                sb.append('a');
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
