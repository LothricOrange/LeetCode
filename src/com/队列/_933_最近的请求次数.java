package com.队列;

import java.util.LinkedList;
import java.util.Queue;

public class _933_最近的请求次数 {

    Queue<Integer> queue;
    public _933_最近的请求次数() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        while (!queue.isEmpty()) {
            int time = queue.peek();
            if (time < t - 3000) {
                queue.poll();
            } else {
                break;
            }
        }

        queue.add(t);

        return queue.size();
    }
}
