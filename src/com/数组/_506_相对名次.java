package com.数组;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class _506_相对名次 {

    public static String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();
        Arrays.sort(score);

        HashMap<Integer, String> map = new HashMap<>();

        if (score.length >= 3) {
            map.put(score[score.length - 1], "Gold Medal");
            map.put(score[score.length - 2], "Silver Medal");
            map.put(score[score.length - 3], "Bronze Medal");
        } else if (score.length == 2) {
            map.put(score[score.length - 1], "Gold Medal");
            map.put(score[score.length - 2], "Silver Medal");
        } else {
            map.put(score[score.length - 1], "Gold Medal");
        }

        int no = 4;
        for (int i = score.length - 4; i >= 0; i--) {
            map.put(score[i], Integer.toString(no));
            no++;
        }
        String[] strs = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strs[i] = map.get(arr[i]);
        }
        return strs;

    }



}
