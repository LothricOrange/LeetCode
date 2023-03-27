package leetCodeA.剑指Offer.第12天_双指针;

public class 剑指Offer25_合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode virHead = new ListNode(-1);
        ListNode node = virHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            } else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            node.next = l2;
        }
        if (l2 == null) {
            node.next = l1;
        }
        return virHead.next;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
