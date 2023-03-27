package com.栈;

import java.util.Stack;

public class _1021_删除最外层的括号 {
    public String removeOuterParentheses2(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ')') {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                sb.append(c);
            }

            if (c == '(') stack.push(c);

        }

        return sb.toString();
    }

    public String removeOuterParentheses(String s) {
        int index = -1;//栈顶
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (chars[i] == '(') {
                if (index > -1) {
                    sb.append('(');
                }
                index++;

            } else {
                index--;
                if (index > -1) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}
