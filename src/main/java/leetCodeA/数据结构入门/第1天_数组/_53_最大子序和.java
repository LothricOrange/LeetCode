package leetCodeA.数据结构入门.第1天_数组;

public class _53_最大子序和 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            num = Math.max(sum,num);

        }
        return num;
    }
}
