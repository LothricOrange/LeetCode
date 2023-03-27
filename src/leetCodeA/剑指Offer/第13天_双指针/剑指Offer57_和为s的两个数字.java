package leetCodeA.剑指Offer.第13天_双指针;

public class 剑指Offer57_和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                arr[0] = nums[left];
                arr[1] = nums[right];
                return arr;
            }
        }

        return arr;
    }
}
