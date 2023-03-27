package com.数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _2013_检测正方形备 {
    //count:对点进行计数
    //xCount:横坐标为x的点，使用set进行去重，降低计算数量
    //yCount:纵坐标为y的点，使用set进行去重，降低计算数量
    HashMap<String, Integer> count;
    HashMap<Integer, Set<Integer>> xCount;
    HashMap<Integer, Set<Integer>> yCount;

    public _2013_检测正方形备() {
        count = new HashMap<>();
        xCount = new HashMap<>();
        yCount = new HashMap<>();
    }

    public void add(int[] point) {

        String rec = point[0] + "-" + point[1];
        count.put(rec, count.getOrDefault(rec, 0) + 1);

        Set<Integer> tempX = xCount.getOrDefault(point[0], new HashSet<Integer>());
        tempX.add(point[1]);
        xCount.put(point[0], tempX);

        Set<Integer> tempY = yCount.getOrDefault(point[1], new HashSet<Integer>());
        tempY.add(point[0]);
        yCount.put(point[1], tempY);
    }

    public int count(int[] point) {
        int ans = 0;
        int x = point[0], y = point[1];
        Set<Integer> tempX = xCount.getOrDefault(point[0], new HashSet<>());
        Set<Integer> tempY = yCount.getOrDefault(point[1], new HashSet<>());
        if(tempX.size() == 0 || tempY.size() == 0) return 0;

        for(int i : tempX) {
            String point1 = x + "-" + i;
            if(i == y) continue;
            for(int j : tempY) {
                if(Math.abs(j - x) != Math.abs(i - y) || j == x) continue;
                String point2 = j + "-" + y;
                String point3 = j + "-" + i;
                ans += count.getOrDefault(point1, 0) * count.getOrDefault(point2, 0) * count.getOrDefault(point3, 0);
            }
        }
        return ans;
    }
}
