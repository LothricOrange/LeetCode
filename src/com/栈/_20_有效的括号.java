package com.栈;

import java.util.HashMap;
import java.util.Stack;

public class _20_有效的括号 {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '('
                    || c == '{'
                    || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char left = stack.pop();
                if (c == ')' && left != '(') return false;
                if (c == ']' && left != '[') return false;
                if (c == '}' && left != '{') return false;
            }
        }
        return stack.isEmpty();
    }


    private static HashMap<Character, Character> map = new HashMap<>();

    static {
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
    }

    public boolean isValid2(String s) {

        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c != map.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}
