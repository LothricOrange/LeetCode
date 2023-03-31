package newBegin.链表;

public class _24_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode virtualNode = new ListNode(-1);
        virtualNode.next = head;
        ListNode cur = virtualNode;
        ListNode firPoint = head;
        ListNode secPoint = head;
        while (cur.next != null && cur.next.next != null) {
            ListNode tmp = cur.next.next.next;
            firPoint = cur.next;
            secPoint = cur.next.next;
            cur.next = secPoint;
            firPoint.next = tmp;
            secPoint.next = firPoint;
            cur = firPoint;
        }

        return virtualNode.next;
    }
}
