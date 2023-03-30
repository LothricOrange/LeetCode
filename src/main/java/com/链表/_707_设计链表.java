package com.链表;

import java.util.LinkedList;
import java.util.List;

public class _707_设计链表 {
    private Node first;
    private Node last;
    private int size = 0;
    public _707_设计链表() {
    }


    public int get(int index) {
        if (index >= size) return -1;
        return node(index).val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index < 0) {
            addAtHead(val);
        } else if (index == size) {
            Node oldLast = last;
            last = new Node(oldLast, val, null);
            if (oldLast == null) {
                first = last;
            } else {
                oldLast.next = last;
            }
        } else {
            Node next = node(index);
            Node prev = next.prev;
            Node node = new Node(prev, val, next);
            next.prev = node;
            if (prev == null) {
                first = node;
            } else {
                prev.next = node;
            }
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        Node oldNode = node(index);
        Node prev = oldNode.prev;
        Node next = oldNode.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
        }
        size--;
    }

    private Node node(int index) {
        if (index < (size >> 1)) {
            Node node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    private static class Node {
        int val;
        Node prev;
        Node next;
        Node(Node prev, int val, Node next) {
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }
}
