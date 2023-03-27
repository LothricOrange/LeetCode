package com.数组;

import java.util.*;

public class _1200_最小绝对差 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i] - arr[i - 1];
            if (min < value) continue;
            min = value;
            List<Integer> slist = new ArrayList<>();
            slist.add(arr[i - 1]);
            slist.add(arr[i]);
            list.add(slist);
        }

        for (List<Integer> sList : list) {
            if (sList.get(1) - sList.get(0) == min) res.add(sList);
        }

        return res;
    }
}
