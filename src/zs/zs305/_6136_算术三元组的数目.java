package zs.zs305;

public class _6136_算术三元组的数目 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int cmp = nums[j] - nums[i];
                if (cmp == diff) {
                    count++;
                    break;
                } else if (cmp > diff) {
                    break;
                }
            }
        }

        return count;
    }
}
