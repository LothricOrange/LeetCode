package newBegin.链表;


/**
    链表中结点的数目为 sz
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz
* */
public class _19_删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualNode = new ListNode(-1);
        virtualNode.next = head;
        ListNode slowPoint = virtualNode;
        ListNode fastPoint = virtualNode;
        while (n > 0) {
            fastPoint = fastPoint.next;
            n--;
        }
        if (fastPoint == null) return head;
        while (fastPoint.next != null) {
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next;
        }
        slowPoint.next = slowPoint.next.next;
        return virtualNode.next;
    }
}
