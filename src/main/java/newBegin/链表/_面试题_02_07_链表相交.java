package newBegin.链表;

import java.util.HashSet;
import java.util.Set;

public class _面试题_02_07_链表相交 {
    public ListNode getIntersectionNodeII(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        //TODO
        return null;
    }

    public ListNode getIntersectionNodeI(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (!set.add(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
