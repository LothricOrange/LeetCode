package com.math;

import java.util.LinkedList;
import java.util.Queue;

public class _1823_找出游戏的获胜者 {
    public int findTheWinner(int n, int k) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + k) % i;
        }
        return p + 1;
    }

    public int findTheWinner2(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i ++ ) q.add(i);
        for (int i = 1; i < n; i ++ ) {
            for (int j = 1; j < k; j ++ ) q.add(q.poll());
            q.poll();
        }
        return q.poll();
    }
}
