package com.设计;

import java.util.LinkedList;
import java.util.List;

public class _641_设计循环双端队列 {
    List<Integer> list;
    int fullSize;
    public _641_设计循环双端队列(int k) {
        list = new LinkedList<>();
        fullSize = k;
    }

    public boolean insertFront(int value) {
        if (list.size() == fullSize) return false;
        list.add(0, value);
        return true;
    }

    public boolean insertLast(int value) {
        if (list.size() == fullSize) return false;
        list.add(value);
        return true;
    }

    public boolean deleteFront() {
        if (list.size() == 0) return false;
        list.remove(0);
        return true;
    }

    public boolean deleteLast() {
        if (list.size() == 0) return false;
        list.remove(list.size() - 1);
        return true;
    }

    public int getFront() {
        int len = list.size();
        if (len == 0) return -1;
        return list.get(0);
    }

    public int getRear() {
        int len = list.size();
        if (len == 0) return -1;
        return list.get(len - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == fullSize;
    }
}

class _641_设计循环双端队列2 {
    int[] arr;
    int left = 0;
    int right;
    int size = 0;
    public _641_设计循环双端队列2(int k) {
        arr = new int[k];
        right = k - 1;
    }

    public boolean insertFront(int value) {
        if (size == arr.length) return false;
        left = (left == 0 ? arr.length - 1 : left - 1);
        arr[left] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == arr.length) return false;
        right = (right == arr.length - 1 ? 0 : right + 1);
        arr[right] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) return false;
        size--;
        left = (left == arr.length - 1 ? 0 : left + 1);
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) return false;
        size--;
        right = (getRear() == 0 ? arr.length - 1 : right - 1);
        return true;
    }

    public int getFront() {
        if (size == 0) return -1;
        return arr[left];
    }

    public int getRear() {
        if (size == 0) return -1;
        return arr[right];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}
