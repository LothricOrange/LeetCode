package com.链表;
/**
 *https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 **/
public class _83_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if (node == null) {
            return null;
        }
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
