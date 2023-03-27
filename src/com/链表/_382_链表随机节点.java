package com.链表;

import java.util.ArrayList;
import java.util.Random;

public class _382_链表随机节点 {
    ArrayList<Integer> list = new ArrayList<>();
    ListNode heads;
    int size;
    public _382_链表随机节点(ListNode head) {
        this.heads = head;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        size = list.size();
    }

    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(size);
        return list.get(index);
    }
}
