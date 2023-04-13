package newBegin.动态规划;

public class _509_斐波那契数 {
    public int fib(int n) {
        if (n < 2) return n;
        int a = 0;
        int b = 1;
        int tmp = 0;
        for (int i = 2; i <= n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
}
