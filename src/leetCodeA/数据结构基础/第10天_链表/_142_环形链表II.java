package leetCodeA.数据结构基础.第10天_链表;

import java.util.HashSet;

public class _142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (set.add(node)) {
                node = node.next;
            } else {
                return node;
            }
        }
        return node;
    }
}
