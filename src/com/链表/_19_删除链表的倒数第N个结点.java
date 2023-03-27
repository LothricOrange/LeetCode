package com.链表;


/**
 * https://leetcode-cn.com/study-plan/algorithms/?progress=58svcn7
 */
public class _19_删除链表的倒数第N个结点 {
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNode(head, n) == n ? head.next : head;
    }

    public int removeNode(ListNode node, int n) {
        if (node.next == null) return 1;
        int m = removeNode(node.next, n);
        if (m == n)
            if (m == 1) node.next = null;
            else node.next = node.next.next;
        return m + 1;
    }*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
