package newBegin.question_of_the_day;

import java.util.Arrays;

public class _2441_与对应负数同时存在的最大正整数 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int abs = -nums[left];
            if (abs == nums[right]) {
                return nums[right];
            } else if (abs > nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}
