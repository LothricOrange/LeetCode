package com.数组;

import java.util.Arrays;

public class _1984_学生分数的最小差值 {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length < 2) return 0;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= nums.length - k; i++){
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}

/*
....................../´¯/)
....................,/¯../
.................../..../
............./´¯/'...'/´¯¯`·¸
........../'/.../..../......./¨¯\
........('(...´...´.... ¯~/'...')
.........\.................'...../
..........''...\.......... _.·´
............\..............(
..............\.............\..
* */
