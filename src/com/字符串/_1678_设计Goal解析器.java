package com.字符串;

public class _1678_设计Goal解析器 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] chars = command.toCharArray();
        short index = 0;
        while (index < chars.length) {
            char c = chars[index];
            if (c == 'G') sb.append(c);
            else if (c == '(') {
                if (chars[index + 1] == ')') {
                    sb.append('o');
                } else {
                    sb.append("al");
                    index += 3;
                }
            }
            index++;
        }
        return sb.toString();
    }
}
