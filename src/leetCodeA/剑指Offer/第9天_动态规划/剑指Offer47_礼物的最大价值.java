package leetCodeA.剑指Offer.第9天_动态规划;

public class 剑指Offer47_礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < row; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        int max = 0;
        int lIndex = row - 1;
        for (int i = 0; i < col; i++) {
            max = Math.max(dp[lIndex][i], max);
        }
        return max;
    }
}
