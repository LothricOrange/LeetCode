package com.队列;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _225_用队列实现栈 {
    Queue<Integer> inQueue;
    Queue<Integer> outQueue;
    public _225_用队列实现栈() {
        inQueue = new LinkedList<>();
        outQueue = new LinkedList<>();
    }

    public void push(int x) {
        inQueue.offer(x);
        while(!outQueue.isEmpty()) {
            inQueue.offer(outQueue.poll());
        }
        Queue temp = inQueue;
        inQueue = outQueue;
        outQueue = temp;
    }

    public int pop() {

        return outQueue.poll();
    }

    public int top() {

        return outQueue.peek();
    }

    public boolean empty() {
        return inQueue.isEmpty() && outQueue.isEmpty();
    }
}
