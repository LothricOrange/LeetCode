package leetCodeA.剑指Offer.第17天_排序;

import java.util.PriorityQueue;

public class 剑指Offer41_数据流中的中位数 {
    PriorityQueue pq;

    public 剑指Offer41_数据流中的中位数() {
        pq = new PriorityQueue();
    }

    public void addNum(int num) {
        pq.add(num);
    }

    public double findMedian() {
        if ((pq.size() & 1) == 1) {

        }

        return 0;
    }
}
