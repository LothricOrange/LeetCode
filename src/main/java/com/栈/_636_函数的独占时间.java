package com.栈;

import java.util.List;
import java.util.Stack;

public class _636_函数的独占时间 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] arr = new int[n];
        Stack<int[]> stack = new Stack<>();
        for (String str : logs) {
            String[] split = str.split(":");
            int fun = Integer.parseInt(split[0]);
            int time = Integer.parseInt(split[2]);
            if ("start".equals(split[1])) {
                stack.push(new int[] {fun, time});
            } else {
                int[] pop = stack.pop();
                int delta = time - pop[1] + 1;
                arr[pop[0]] += delta;
                if (!stack.isEmpty()) {
                    arr[stack.peek()[0]] -= delta;
                }
            }
        }
        return arr;
    }
}
