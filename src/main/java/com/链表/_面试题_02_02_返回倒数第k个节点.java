package com.链表;

public class _面试题_02_02_返回倒数第k个节点 {
    public int kthToLast(ListNode head, int k) {
        ListNode slowPoint = head;
        ListNode fastPoint = head;
        while (k > 0) {
            fastPoint = fastPoint.next;
            k--;
        }
        while (fastPoint != null) {
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next;
        }
        return slowPoint.val;
    }
}
