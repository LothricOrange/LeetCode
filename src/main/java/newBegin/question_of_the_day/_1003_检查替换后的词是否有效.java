package newBegin.question_of_the_day;

import java.util.Stack;

public class _1003_检查替换后的词是否有效 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'a') stack.push(c);
            else if (c == 'b' && !stack.isEmpty() && stack.peek() == 'a') stack.push(c);
            else if (c == 'c' && !stack.isEmpty() && stack.peek() == 'b') {
                stack.pop();
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}
