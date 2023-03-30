package com.正则;

public class _2047_句子中的有效单词数 {
    public int countValidWords(String sentence) {
        int ans = 0;
        String[] strs = sentence.split(" ");
        String regex = "([a-z]*|([a-z]+-[a-z]+))[!.,]?";
        for (String str : strs) {
            if (str.length() > 0 && str.matches(regex)) {
                ans++;
            }
        }
        return ans;
    }
}
