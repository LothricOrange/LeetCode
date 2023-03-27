package com.堆;

public class _155_最小栈 {
    int[] elements;
    int size;
    private static final int DEFAULT_CAPACITY = 10;
    public _155_最小栈() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void push(int val) {
        ensureCapacity(size + 1);
        elements[size] = val;
        size++;
        siftUp(size - 1);
    }

    public void pop() {

    }

    public int top() {
        return elements[0];
    }

    public int getMin() {
        return elements[0];
    }

    protected void siftUp(int index) {
        int element = elements[index];
        while (index > 0) {
            int parentIndex = (index - 1) >> 1;
            if (elements[index] <= elements[parentIndex]) {
                break;
            }
            elements[index] = elements[parentIndex];
            index = parentIndex;
        }
        elements[index] = element;

    }

    protected void siftDown(int index) {
        int half = size >> 1;
        int element = elements[index];
        while (index < half) {
            int childIndex = (index << 1) + 1;
            int child = elements[childIndex];
            int rightIndex = childIndex + 1;
            if (rightIndex < size && elements[rightIndex] > child) {
                child = elements[rightIndex];
                childIndex = rightIndex;
            }
            if (element >= child) break;
            element = child;
            index = childIndex;
        }
        elements[index] = element;
    }

    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity > capacity) return;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
