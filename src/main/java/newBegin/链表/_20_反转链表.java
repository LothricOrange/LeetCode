package newBegin.链表;

//https://leetcode.cn/problems/reverse-linked-list/
public class _20_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode slowPoint = null;
        ListNode fastPoint = head;
        ListNode tmpNode;
        while (fastPoint != null) {
            tmpNode = fastPoint.next;
            fastPoint.next = slowPoint;
            slowPoint = fastPoint;
            fastPoint = tmpNode;
        }

        return slowPoint;
    }
}
