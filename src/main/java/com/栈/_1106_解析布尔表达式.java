package com.栈;

import java.util.Stack;

public class _1106_解析布尔表达式 {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack();
        for (char c : expression.toCharArray()) {
            if (c == ')') {
                int t = 0,f = 0;
                char tmp;
                while ((tmp = stack.peek()) != '(') {
                    if (tmp == 't') t++;
                    else f++;
                    stack.pop();
                }
                stack.pop();

                char op = stack.pop();

                if (op == '&') {
                    char ans = f > 0 ? 'f' : 't';
                    stack.push(ans);
                } else if (op == '|') {
                    char ans = t > 0 ? 't' : 'f';
                    stack.push(ans);
                } else {
                    char ans = t > 0 ? 'f' : 't';
                    stack.push(ans);
                }
            } else if (c != ',') {
                stack.push(c);
            }

        }

        return stack.peek() == 't';
    }
}
