package leetCodeA.剑指Offer.第8天_动态规划;

public class 剑指Offer10_II青蛙跳台阶问题 {
    public int numWays(int n) {
        if (n < 2) return 1;
        int numA = 1;
        int numB = 2;
        int tmp;
        for (int i = 3; i <= n; i++) {
             tmp = numA + numB;
             numA = numB;
             numB = tmp % 1000000007;
        }

        return numB;
    }
}
