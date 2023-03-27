package com.位运算;

public class _2044_统计按位或能得到最大值的子集数目 {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max |= num;
        }
        return dfs(0, nums, 0, max);
    }

    public int dfs(int index, int[] nums, int value, int max) {
        if (index == nums.length) return value == max ? 1 : 0;
        return dfs(index + 1, nums, value | nums[index], max) + dfs(index + 1, nums, value, max);
    }
}
