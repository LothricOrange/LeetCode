package com.字符串;

public class _796_旋转字符串 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(goal).append(goal);
        return sb.toString().contains(s);
    }
}
