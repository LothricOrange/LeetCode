package com.动态规划;

public class _357_统计各位数字都不同的数字个数 {

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;

        for (int i = 2; i <= n; i++) {
            int index = i - 1;
            dp[i] = dp[index] + (dp[index] - dp[index - 1]) * (10 - index);
        }

        return dp[n];
    }
}
