package newBegin.动态规划;

public class _70_爬楼梯 {
    public int climbStairs(int n) {
        if (n < 2) return n;
        int a = 1;
        int b = 2;
        int tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
}
