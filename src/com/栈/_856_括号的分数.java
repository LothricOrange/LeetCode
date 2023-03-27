package com.栈;

import java.util.Stack;

/**
 *
 * https://leetcode-cn.com/problems/score-of-parentheses/
 * */
public class _856_括号的分数 {
    public int scoreOfParentheses(String s) {
        int res = 0;
        int n = 0;
        char[] chars = s.toCharArray();
        char old = ' ';
        for (char c : chars) {
            if (c == '(') {
                if (n == 0) {
                    n = 1;
                } else {
                    n = n << 1;
                }
            } else {
                if (old == '(') {
                    res += n;
                }

                n = n >> 1;
            }
            old = c;
        }
        return res;
    }
}
