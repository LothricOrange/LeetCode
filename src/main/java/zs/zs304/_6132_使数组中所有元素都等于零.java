package zs.zs304;

import java.util.Arrays;

public class _6132_使数组中所有元素都等于零 {
    public int minimumOperations(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0) return 0;
            else return 1;
        }
        Arrays.sort(nums);
        int count = 0;
        int max = nums[nums.length - 1];

        int index = 0;
        while (index < nums.length){
            if (nums[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        int min = 0;
        if (index < nums.length) {
            min = nums[index];
        } else {
            return min;
        }

        int sum = min;
        index++;
        while (index < nums.length){
            int deta = nums[index] - sum;
            if (deta == 0) continue;
            min = deta;
            sum += min;
            count++;
            if (sum >= max) {
                return count;
            }
            index++;
        }

        return count;
    }
}
