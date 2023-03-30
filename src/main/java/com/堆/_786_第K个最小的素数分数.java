package com.堆;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _786_第K个最小的素数分数 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return Double.compare(b[0] * 1.0 * a[1], a[0] * 1.0 * b[1]);
        });

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double val = arr[i] * 1.0 / arr[j];
                if (pq.size() < k || pq.peek()[0] * 1.0 / pq.peek()[1] > val) {
                    if (pq.size() == k) pq.poll();
                    pq.add(new int[] {arr[i], arr[j]});
                }
            }
        }
        return pq.poll();
    }
}
