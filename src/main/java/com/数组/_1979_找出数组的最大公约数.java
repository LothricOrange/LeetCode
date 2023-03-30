package com.数组;

import java.util.Arrays;

public class _1979_找出数组的最大公约数 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return find(nums[0], nums[nums.length - 1]);
    }

    public int find(int a, int b) {
        if (b == 0) return a;
        return find(b, a % b);
    }
}
