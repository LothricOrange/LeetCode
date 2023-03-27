package com.数组;

import java.util.HashSet;

public class _1791_找出星型图的中心节点 {
    public int findCenter(int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            if (set.add(edges[i][0])) {
                if (set.add(edges[i][1])) {
                } else {
                    return edges[i][1];
                }
            } else {
                return edges[i][0];
            }
        }
        return 0;
    }
}
