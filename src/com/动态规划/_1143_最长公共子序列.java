package com.动态规划;

public class _1143_最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) return 0;

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        if (arr1.length == 0 || arr2.length == 0) return 0;
        int[][] dp = new int[2][arr2.length + 1];

        for (int i = 1; i <= arr1.length; i++) {
            for (int j = 1; j <= arr2.length; j++) {

                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[arr1.length][arr2.length];
    }

    public int longestCommonSubsequence2(String text1, String text2) {
        if (text1 == null || text2 == null) return 0;

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        if (arr1.length == 0 || arr2.length == 0) return 0;
        int[][] dp = new int[arr1.length + 1][arr2.length + 1];

        for (int i = 1; i <= arr1.length; i++) {
            for (int j = 1; j <= arr2.length; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[arr1.length][arr2.length];
    }
}
