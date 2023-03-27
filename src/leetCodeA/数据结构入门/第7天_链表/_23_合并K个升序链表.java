package leetCodeA.数据结构入门.第7天_链表;

public class _23_合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        for (int i = 1; i < lists.length; i++) {
            lists[0] = mergeTwoLists(lists[0], lists[i]);
        }
        return lists[0];
    }
    ListNode virtualNode = new ListNode(-1);
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        virtualNode.next = null;
        ListNode node = virtualNode;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                l2 = l2.next;
            } else {
                node.next = l1;
                l1 = l1.next;
            }
            node = node.next;
        }

        node.next = l1 == null ? l2 : l1;
        return virtualNode.next;
    }
}
