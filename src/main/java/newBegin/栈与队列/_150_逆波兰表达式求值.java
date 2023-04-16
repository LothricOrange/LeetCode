package newBegin.栈与队列;

import java.util.Stack;

public class _150_逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i]) || "-".equals(tokens[i]) || "*".equals(tokens[i]) || "/".equals(tokens[i])) {
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                if ("+".equals(tokens[i])) {
                    stack.push(tmp2 + tmp1);
                } else if ("-".equals(tokens[i])) {
                    stack.push(tmp2 - tmp1);
                } else if ("*".equals(tokens[i])) {
                    stack.push(tmp2 * tmp1);
                } else if ("/".equals(tokens[i])) {
                    stack.push(tmp2 / tmp1);
                }
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
