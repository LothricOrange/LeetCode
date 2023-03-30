package com.链表;


import java.util.HashSet;
import java.util.Set;

public class _234_回文链表 {
    public boolean isPalindrome(ListNode head) {
        Set<Integer> set = new HashSet<>();
        int size = 0;
        while (head != null) {
            size++;
            set.add(head.val);
            head = head.next;
        }
        if ((size & 1) == 1) return set.size() == (size >> 1) + 1;
        return set.size() == (size >> 1);
    }
}
