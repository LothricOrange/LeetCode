package com.链表;

public class _206_反转链表 {
    public ListNode reverseList(ListNode head) {
        //递归
        /*if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;*/

        //迭代
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode = null;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }

        return newNode;
    }
}
