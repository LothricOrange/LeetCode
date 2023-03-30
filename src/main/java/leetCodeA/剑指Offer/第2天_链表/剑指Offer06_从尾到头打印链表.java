package leetCodeA.剑指Offer.第2天_链表;

import java.util.Stack;

public class 剑指Offer06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int cap = 0;
        while (node != null) {
            node = node.next;
            cap++;
        }

        int[] arr = new int[cap];
        int index = cap - 1;
        while (head != null) {
            arr[index] = head.val;
            head = head.next;
            index--;
        }
        return arr;
    }

    public int[] reversePrint2(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index] = stack.pop();
            index++;
        }
        return arr;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
