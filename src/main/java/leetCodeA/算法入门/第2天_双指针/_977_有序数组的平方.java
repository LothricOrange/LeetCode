package leetCodeA.算法入门.第2天_双指针;

import java.util.Arrays;

public class _977_有序数组的平方 {

    public int[] sortedSquares(int[] nums) {
        /*for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;*/
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] arr = new int[len];
        int index = right;
        int lValue;
        int RValue;
        while (left <= right) {
            lValue = nums[left] * nums[left];
            RValue = nums[right] * nums[right];
            if (lValue > RValue) {
                arr[index] = lValue;
                left++;
            } else {
                arr[index] = RValue;
                right--;
            }
            index--;
        }
        return arr;

    }
}
