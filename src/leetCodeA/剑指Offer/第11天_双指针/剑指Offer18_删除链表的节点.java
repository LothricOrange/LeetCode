package leetCodeA.剑指Offer.第11天_双指针;

public class 剑指Offer18_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        ListNode oldNode = head;
        if (head.val == val) return head.next;
        while (node != null) {
            if (node.val == val) {
                oldNode.next = node.next;
                return head;
            }
            oldNode = node;
            node = node.next;
        }

        return head;
    }
}

