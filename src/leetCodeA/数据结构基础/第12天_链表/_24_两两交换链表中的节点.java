package leetCodeA.数据结构基础.第12天_链表;

public class _24_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        int tmp;
        ListNode node = head;
        while (node != null && node.next != null) {
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;
            node = node.next.next;
        }
        return head;
    }
}
