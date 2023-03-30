package com.字符串;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _859_亲密字符串 {

    public boolean buddyStrings(String s, String goal) {
        if (s == null || goal == null) return false;
        int sLen = s.length();
        int gLen = goal.length();
        if (sLen != gLen) return false;
        List<Integer> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();

        if (s.equals(goal)) {
            for (int i = 0; i < sLen; i++) {
                char sChar = s.charAt(i);
                if (!set.add(sChar)) {
                    return true;
                }
            }
            return false;
        } else {
            for (int i = 0; i < sLen; i++) {
                char sChar = s.charAt(i);
                char gChar = goal.charAt(i);
                if (sChar != gChar) {
                    list.add(i);
                }
            }
        }

        if (list.size() != 2) return false;
        int index1 = list.remove(1);
        int index2 = list.remove(0);
        return s.charAt(index1) == goal.charAt(index2) && goal.charAt(index1) == s.charAt(index2);

    }
}
