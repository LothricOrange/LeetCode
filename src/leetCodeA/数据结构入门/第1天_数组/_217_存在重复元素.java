package leetCodeA.数据结构入门.第1天_数组;

import java.util.HashSet;

public class _217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        return len != set.size();
    }
}
