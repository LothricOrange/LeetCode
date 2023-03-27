package leetCodeA.数据结构基础.第11天_链表;

import java.util.HashMap;
import java.util.HashSet;

public class _82_删除排序链表中的重复元素II {
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode node = head;

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        while (node != null) {
            if (!setA.add(node.val)) {
                setB.add(node.val);
            }
            node = node.next;
        }
        ListNode virNode = new ListNode(-101);
        virNode.next = head;
        node = virNode;

        while (node != null) {
            if (setB.contains(node.val)) {
                node.next = node.next.next;
            } else {

            }
        }

        return head;

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode nextNode = head.next;
        if (head.val == nextNode.val) {
            do {
                nextNode = nextNode.next;
            } while (nextNode != null && nextNode.val == head.val);

            head = deleteDuplicates(nextNode);


        } else {
            head.next = deleteDuplicates(nextNode);
        }

        return head;
    }


}
