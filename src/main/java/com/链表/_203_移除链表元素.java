package com.链表;
/**
*
* https://leetcode-cn.com/problems/remove-linked-list-elements/
* */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ReallyHead = new ListNode(-1);
        ReallyHead.next = head;
        ListNode node = ReallyHead;
        while (node.next != null) {
            if(node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }

        }
        return ReallyHead.next;
    }
}
