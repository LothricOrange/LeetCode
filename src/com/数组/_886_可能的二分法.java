package com.数组;

public class _886_可能的二分法 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        UnionFind_QuickUnion uk = new UnionFind_QuickUnion((n << 1) + 1);
        for (int[] arr : dislikes) {
            int p1 = uk.find(arr[0]);
            int p2 = uk.find(arr[1]);
            if (p1 == p2) return false;
            uk.parents[uk.find(p1 + n)] = p2;
            uk.parents[uk.find(p2 + n)] = p1;
        }
        return true;
    }

    private class UnionFind_QuickUnion {
        public int[] parents;
        public UnionFind_QuickUnion(int capacity) {
            parents = new int[capacity];
            for (int i = 0; i < capacity; i++) {
                parents[i] = i;
            }
        }

        public void union(int v1, int v2) {
            int p1 = find(v1);
            int p2 = find(v2);
            if (p1 == p2) return;
            parents[p1] = p2;
        }


        public int find(int x) {
            return x == parents[x] ? x : (parents[x] = find(parents[x]));
        }

        /*public int find(int v) {
            while (v != parents[v]) {
                v = parents[v];
            }
            return v;
        }*/
    }
}
