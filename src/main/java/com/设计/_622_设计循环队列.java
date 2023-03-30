package com.设计;

import java.util.ArrayList;

public class _622_设计循环队列 {
    int capacity;
    int size = 0;
    int[] element;
    int begin = 0;
    int end = 0;
    public _622_设计循环队列(int k) {
        this.capacity = k;
        element = new int[capacity];
    }

    public boolean enQueue(int value) {
        if (size == capacity) return false;
        element[end] = value;
        end = (end + 1) % capacity;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0) return false;
        size--;
        begin = (begin + 1) % capacity;
        return true;
    }

    public int Front() {
        return size == 0 ? -1 : element[begin];
    }

    public int Rear() {
        return size == 0 ? -1 : element[(end - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
