package leetCodeA.剑指Offer.第16天_排序;

import java.util.Arrays;

public class 剑指Offer61_扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            }
            int sub = nums[i + 1] - nums[i];
            int v = sub - 1;
            if (v < 0) {
                return false;
            } else if (v > 0) {
                count -= v;
                if (count < 0) return false;
            }
        }
        return true;
    }
}
