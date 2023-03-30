package com.栈;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _735_行星碰撞 {

    public static int[] asteroidCollision1(int[] arr) {
        Deque<Integer> stack = new LinkedList<>();
        for (int cur : arr) {
            if (stack.isEmpty() || stack.peek() < 0 || cur > 0) stack.push(cur);
            else { // cur为负数，栈内有元素，且栈顶为正数：cur向左移动，不断碰撞向右移动的行星，栈内为正数，且体积小于cur的行星爆炸
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -cur) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -cur) stack.pop(); // 栈顶与cur体积相同的行星与cur同归于尽
                else if (stack.isEmpty() || stack.peek() < 0) stack.push(cur); // 栈空或者同向
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = stack.pollLast();
        return ans;
    }

    public int[] asteroidCollision2(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index < asteroids.length) {
            if (asteroids[index] > 0) break;
            index++;
        }

        for (int i = index; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                int num = stack.pop();
                int cmp = -asteroids[i];
                if (num == cmp) {
                    continue;
                } else if (num < cmp) {
                    while (!stack.isEmpty()) {
                        num = stack.pop();
                        if (num > cmp) {
                            stack.push(num);
                            break;
                        }
                    }
                    if (stack.isEmpty()) {
                        //left
                    }

                } else if (num > cmp) {
                    stack.push(num);
                }
            }
        }

        return null;
    }
}
