package zs.szs84;


public class _6142_统计坏数对的数目 {
    public long countBadPairs(int[] nums) {
        int count = 0;
        int tool = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int cmp = nums[j] - nums[i];
                if (cmp <= 0 || cmp > tool || j - i != cmp) count++;
            }
        }
        return count;
    }
}
