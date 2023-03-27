package leetCodeA.剑指Offer.第17天_排序;

import java.util.PriorityQueue;

public class 剑指Offer40_最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) return new int[0];
        int[] arrK = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue(k);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            arrK[i] = pq.poll();
        }

        return arrK;
    }
}
