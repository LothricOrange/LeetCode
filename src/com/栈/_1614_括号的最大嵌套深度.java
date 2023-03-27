package com.栈;

import java.util.Stack;

public class _1614_括号的最大嵌套深度 {
    public int maxDepth(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        int tmp = 0;
        for (char c : chars) {
            if (c == '(') {
                tmp++;
                ans = Math.max(ans, tmp);
            } else if (c == ')') {
                tmp--;
            }
        }
        return ans;
    }
}
