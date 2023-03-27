package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _面试题_17_11_单词距离 {
    public int findClosest(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int begin = -100000;
        int end = 100000;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                begin = i;
            } else if (words[i].equals(word2)) {
                end = i;
            }

            min = Math.min(Math.abs(begin - end), min);
            if (min == 1) return min;
        }


        return min;
    }

    public int findClosest2(String[] words, String word1, String word2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                list1.add(i);
            } else if (words[i].equals(word2)) {
                list2.add(i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer integer1 : list1) {
            for (Integer integer2 : list2) {
                min = Math.min(Math.abs(integer1 - integer2), min);
            }
        }
        return min;
    }
}
