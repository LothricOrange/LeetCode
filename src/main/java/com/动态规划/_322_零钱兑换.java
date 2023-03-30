package com.动态规划;

public class _322_零钱兑换 {

    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        if (coins == null || coins.length == 0) return -1;
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int face : coins) {
                if (i < face) continue;
                int v = dp[i - face];
                if (v < 0 || v >= min) continue;
                min = v;
            }
            if (min == Integer.MAX_VALUE) {
                dp[i] = -1;
            } else {
                dp[i] = min + 1;
            }
        }
        return dp[amount];
    }

}
