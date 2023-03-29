package newBegin.链表;

public class _203_移除链表元素 {
    public ListNode removeElementsI(ListNode head, int val) {
        if (head == null) return null;
        ListNode virtualNode = new ListNode(-1);
        virtualNode.next = head;
        ListNode node = head;
        ListNode frontNode = virtualNode;
        while (node != null) {
            if (node.val == val) {
                frontNode.next = node.next;
            } else {
                frontNode = node;
            }
            node = node.next;
        }
        return virtualNode.next;
    }
}
