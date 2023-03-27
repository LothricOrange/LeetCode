package com.字符串;

import java.util.Stack;

public class _71_简化路径 {
    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (String str : strs) {
            if (str.equals(".") || str.equals("")) {
            } else if (str.equals("..")) {
                if (stack.isEmpty()) continue;
                stack.pop();
            } else {
                stack.push(str);
            }
        }

        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        if (sb.length() == 0) sb.append("/");
        return sb.toString();
    }
}
