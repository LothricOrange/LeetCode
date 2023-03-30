package com.哈希表;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _884_两句话中的不常见单词 {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");

        for (String str : ss1) {
            if (setA.add(str)) continue;
            setB.add(str);
        }

        for (String str : ss2) {
            if (setA.add(str)) continue;
            setB.add(str);
        }

        for (String str : setA) {
            if (setB.contains(str)) continue;
            sb.append(str).append(" ");
        }

        String[] strs = sb.toString().trim().split(" ");
        if (strs[0] == "") return new String[0];
        return strs;
    }
}
