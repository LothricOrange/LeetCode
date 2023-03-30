package leetCodeA.剑指Offer.第13天_双指针;

public class 剑指Offer21_调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = arr.length - 1;
        int index = 0;
        while (left <= right) {
            if ((nums[index] & 1) == 1) {
                arr[left] = nums[index];
                left++;
            } else {
                arr[right] = nums[index];
                right--;
            }
            index++;
        }

        return arr;
    }
}
