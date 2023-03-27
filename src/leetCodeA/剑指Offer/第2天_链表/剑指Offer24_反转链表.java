package leetCodeA.剑指Offer.第2天_链表;

import java.util.ArrayList;
import java.util.List;

public class 剑指Offer24_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        ListNode next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        node = head;
        int index = list.size() - 1;
        while (node != null) {
            node.val = list.get(index);
            node = node.next;
            index--;
        }
        return head;
    }
}
