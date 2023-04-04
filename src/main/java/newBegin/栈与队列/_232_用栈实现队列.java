package newBegin.栈与队列;

import java.util.Stack;

public class _232_用栈实现队列 {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();
    public _232_用栈实现队列() {
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
