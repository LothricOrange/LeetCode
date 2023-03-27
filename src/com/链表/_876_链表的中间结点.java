package com.链表;


/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */


public class _876_链表的中间结点 {
    public void run() {
        ListNode ln4 = new ListNode(4, null);
        ListNode ln3 = new ListNode(3,ln4);
        ListNode ln2 = new ListNode(2,ln3);
        ListNode ln1 = new ListNode(1,ln2);
        ListNode head = ln1;
        System.out.println("middleNode(head).val = " + middleNode(head).val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}
