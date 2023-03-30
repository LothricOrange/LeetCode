package com.数组;

public class _565_数组嵌套 {
    public int arrayNesting1(int[] nums) {
        int max = 1;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (max > nums.length >> 1) return max;
            if (visited[nums[i]]) continue;
            visited[nums[i]] = true;
            int curMax = 1;
            int cur = nums[nums[i]];
            while (nums[i] != cur) {
                visited[cur] = true;
                curMax++;
                cur = nums[cur];
            }
            max = curMax > max ? curMax : max;
        }
        return max;
    }


    public int arrayNesting(int[] nums) {
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (max > nums.length >> 1) return max;
            int curMax = 1;
            int cur = nums[nums[i]];
            while (nums[i] != cur) {
                curMax++;
                cur = nums[cur];
            }
            max = curMax > max ? curMax : max;
        }
        return max;
    }
}
