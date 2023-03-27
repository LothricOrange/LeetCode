package leetCodeA.leetCode75.第1天;

public class _1480_一维数组的动态和 {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
