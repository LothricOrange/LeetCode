package newBegin.链表;

public class _142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slowPoint = head;
        ListNode fastPoint = head;
        while (fastPoint != null && fastPoint.next != null) {
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;
            if (slowPoint == fastPoint) {
                slowPoint = head;
                while (slowPoint != fastPoint) {
                    slowPoint = slowPoint.next;
                    fastPoint = fastPoint.next;
                }
                return slowPoint;
            }
        }
        return null;
    }
}
