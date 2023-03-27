package leetCodeA.剑指Offer.第4天_查找算法;

import java.util.HashSet;
import java.util.Set;

public class 剑指Offer03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            arr[num]++;
            if (arr[num] > 1) return num;
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.add(num)) continue;
            return num;
        }
        return 0;
    }
}
