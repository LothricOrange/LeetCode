package leetCodeA.剑指Offer.第1天_栈与队列;

import java.util.LinkedList;
import java.util.List;

public class 剑指Offer30_包含min函数的栈 {
    List<Integer> stack;
    int min = Integer.MAX_VALUE;
    boolean flag = false;
    public 剑指Offer30_包含min函数的栈() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        stack.add(x);
        if (min > x) min = x;
    }

    public void pop() {
        flag = true;
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int min() {
        if (flag) {
            min = Integer.MAX_VALUE;
            for (int i : stack) {
                if (min > i) {
                    min = i;
                }
            }
            flag = false;
        }

        return min;
    }
}

class 剑指Offer30_包含min函数的栈2 {
    Node head;
    public 剑指Offer30_包含min函数的栈2() {
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            if (head.min > x) {
                head = new Node(x, x, head);
            } else {
                head = new Node(x, head.min, head);
            }

        }

    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    private static class Node {
        int val;
        int min;
        Node next;
        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
