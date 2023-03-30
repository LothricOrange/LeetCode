package com.栈;

public class Demo {
    public static void main(String[] args) {
        _232_用栈实现队列 q = new _232_用栈实现队列();
        q.push(11);
        q.push(22);
        q.push(33);
        q.push(44);
        System.out.println("q.peek() = " + q.peek());
        while (!q.empty()) {
            System.out.println(q.pop());
        }
    }
}
