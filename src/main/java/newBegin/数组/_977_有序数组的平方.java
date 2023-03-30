package newBegin.数组;

import java.util.Arrays;

public class _977_有序数组的平方 {
    //双指针
    public int[] sortedSquares2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];
        int index = right;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                arr[index] = nums[left] * nums[left];
                left++;
            } else {
                arr[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return arr;
    }


    //暴力
    public int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
