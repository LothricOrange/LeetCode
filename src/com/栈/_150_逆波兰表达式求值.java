package com.栈;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class _150_逆波兰表达式求值 {
    /*public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (str == "*" || str == "/" || str == "+" || str == "-") {
                int rightValue = stack.pop();
                int leftValue = stack.pop();
                if (str == "+") {
                    int value = leftValue + rightValue;
                    stack.push(value);
                } else if (str == "-") {
                    int value = leftValue - rightValue;
                    stack.push(value);
                } else if (str == "*") {
                    int value = leftValue * rightValue;
                    stack.push(value);
                } else {
                    int value = leftValue / rightValue;
                    stack.push(value);
                }
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }*/


    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-" :
                    int right1 = stack.pop();
                    stack.push(stack.pop() - right1);
                    break;
                case "*" :
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/" :
                    int right2 = stack.pop();
                    stack.push(stack.pop() / right2);
                    break;
                default:
                    stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

}
