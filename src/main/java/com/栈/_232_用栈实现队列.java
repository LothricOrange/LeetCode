package com.栈;

import java.util.Stack;

public class _232_用栈实现队列 {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public _232_用栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }


    public void push(int x) {
        inStack.push(x);
    }


    public int pop() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        return outStack.pop();
    }


    public int peek() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
