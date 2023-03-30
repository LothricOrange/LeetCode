package leetCodeA.数据结构基础.第1天_数组;

import java.util.HashSet;

public class _136_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
            } else {
                set.remove(nums[i]);
            }
        }
        for (int num : set) {
            return num;
        }
        return 0;
    }
}
