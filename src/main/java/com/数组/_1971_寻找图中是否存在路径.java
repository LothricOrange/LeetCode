package com.数组;

public class _1971_寻找图中是否存在路径 {
    int[] parents;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        for (int[] arr : edges) {
            union(arr[0], arr[1]);
        }
        return find(source) == find(destination);
    }

    public void union(int v1, int v2) {
        int p1 = find(v1);
        int p2 = find(v2);
        if (p1 == p2) return;
        parents[p1] = p2;
    }

    public int find(int v) {
        while (v != parents[v]) {
            v = parents[v];
        }
        return v;
    }
}
