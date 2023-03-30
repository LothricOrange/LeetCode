package newBegin.数组;

public class _209_长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int begin = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                int len = end - begin + 1;
                min = min < len ? min : len;
                sum -= nums[begin];
                begin++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

