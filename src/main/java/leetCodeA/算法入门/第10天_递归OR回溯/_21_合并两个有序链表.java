package leetCodeA.算法入门.第10天_递归OR回溯;

public class _21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);
        ListNode tempNode = newList;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                tempNode.next = l2;
                l2 = l2.next;
            } else {
                tempNode.next = l1;
                l1 = l1.next;
            }
            tempNode = tempNode.next;
        }
        tempNode.next = l1 == null ? l2 : l1;

        return newList.next;
    }
}
