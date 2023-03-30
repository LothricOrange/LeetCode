package com.数组;

import java.util.HashMap;
import java.util.HashSet;

public class _2013_检测正方形 {
    HashMap<Integer, HashSet<Integer>> mapX;
    HashMap<Integer, HashSet<Integer>> mapY;
    HashMap<String, Integer> count;

    public _2013_检测正方形() {
        mapX = new HashMap<>();
        mapY = new HashMap<>();
        count = new HashMap<>();
    }

    public void add(int[] point) {
        HashSet<Integer> setY = mapX.get(point[0]);
        if (setY == null) {
            HashSet<Integer> tmpSet = new HashSet<>();
            tmpSet.add(point[1]);
            mapX.put(point[0], tmpSet);
        } else {
            setY.add(point[1]);
        }

        HashSet<Integer> setX = mapY.get(point[1]);
        if (setX == null) {
            HashSet<Integer> tmpSet = new HashSet<>();
            tmpSet.add(point[0]);
            mapY.put(point[1], tmpSet);
        } else {
            setX.add(point[0]);
        }

        String rec = point[0] + "-" + point[1];
        count.put(rec, count.getOrDefault(rec, 0) + 1);
    }

    public int count(int[] point) {
        int ans = 0;
        HashSet<Integer> ySet = mapX.get(point[0]);
        HashSet<Integer> xSet = mapY.get(point[1]);
        if (ySet == null || xSet == null) return ans;
        for (int x : xSet) {
            for (int y : ySet) {
                if (Math.abs(x - point[0]) == Math.abs(y - point[1])) {
                    HashSet<Integer> set = mapX.get(x);
                    if (set.contains(y)) ans++;
                }
            }
        }
        return ans;
    }
}
