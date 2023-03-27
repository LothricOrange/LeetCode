package leetCodeA.算法入门.第5天_双指针;

import java.util.HashMap;
import java.util.Map;

public class _19_删除链表的倒数第N个结点 {
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

    /*public ListNode removeNthFromEnd2(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        int count = 1;
        ListNode vNode = new ListNode(-1, head);
        ListNode node = vNode;
        while (node != null) {
            map.put(count, node);
            node = node.next;
            count++;
        }
        deleteNode(map.get(count + 1 - n));
        return vNode.next;
    }*/

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
