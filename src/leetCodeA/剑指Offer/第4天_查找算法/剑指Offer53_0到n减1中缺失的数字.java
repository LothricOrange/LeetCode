package leetCodeA.剑指Offer.第4天_查找算法;

public class 剑指Offer53_0到n减1中缺失的数字 {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (nums[middle] == middle + 1) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public int missingNumber2(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) return i;
        }
        return -1;
    }
}
