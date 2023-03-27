package leetCodeA.数据结构入门.第8天_链表;

public class _206_反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode = null;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }

        return newNode;
    }
}
