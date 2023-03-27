package leetCodeA.剑指Offer.第1天_栈与队列;


import java.util.Stack;

public class 剑指Offer09_用两个栈实现队列 {

    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public 剑指Offer09_用两个栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) return -1;
            do {
                outStack.push(inStack.pop());
            } while (!inStack.isEmpty());
        }
        return outStack.pop();
    }
}
