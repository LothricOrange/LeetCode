package newBegin.字符串;

import java.util.Stack;

public class _1047_删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!stack.isEmpty() && arr[i] == stack.peek()) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
