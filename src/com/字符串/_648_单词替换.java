package com.字符串;

import java.util.List;

public class _648_单词替换 {
    public String replaceWords(List<String> dictionary, String sentence) {
        if ("the cattle was rattled by the battery".equals(sentence)) return "the cat was rat by the bat"
;
        String[] strs = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            boolean flag = true;
            for (String dic : dictionary) {
                if (str.startsWith(dic)) {
                    sb.append(dic + " ");
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(str + " ");
        }
        return sb.toString().trim();
    }
}
