package zs.zs305;

import java.util.Arrays;

public class _6138_最长理想子序列 {
    public int longestIdealString(String s, int k) {
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length];
        Arrays.fill(arr, 1);
        int max = 1;
        for (int i = chars.length - 2; i >= 0; i--) {
            if (Math.abs(chars[i] - chars[i + 1]) <= k) {
                arr[i] += arr[i + 1];
            }
        }
        return max;
    }
}
