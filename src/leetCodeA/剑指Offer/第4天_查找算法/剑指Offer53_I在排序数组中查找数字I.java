package leetCodeA.剑指Offer.第4天_查找算法;

public class 剑指Offer53_I在排序数组中查找数字I {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (target <= nums[middle]) {
                right = middle;
            } else if (target > nums[middle]) {
                left = middle + 1;
            }
        }
        while (left < nums.length && nums[left] == target) {
            left++;
            count++;
        }

        return count;
    }

    public int search2(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) count++;
        }

        return count;
    }
}
