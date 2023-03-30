package leetCodeA.算法入门.第4天_双指针;

import java.util.Stack;

public class _557_反转字符串中的单词III {
    public String reverseWords(String s) {
        s = s + " ";
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public String reverseWords2(String s) {
        String[] str = s.split(" ");
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sbA.append(sbB.append(str[i]).reverse().append(" ").toString());
            sbB.setLength(0);
        }
        sbA.setLength(sbA.length()-1);
        return sbA.toString();
    }
}
