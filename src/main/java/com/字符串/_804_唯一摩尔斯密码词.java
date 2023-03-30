package com.字符串;

import java.util.HashSet;

public class _804_唯一摩尔斯密码词 {
    public int uniqueMorseRepresentations(String[] words) {
        if (words == null || words.length == 0) return 0;

        HashSet<String> set = new HashSet<>();
        String[] arr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                sb.append(arr[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
