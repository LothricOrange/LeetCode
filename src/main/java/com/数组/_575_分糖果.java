package com.数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _575_分糖果 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int val : candyType) {
            set.add(val);
        }
        return Math.min(set.size(), candyType.length >> 1);
    }
}
