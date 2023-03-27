package leetCodeA.leetCode75.第10天;

public class _509_斐波那契数 {
    public int fib(int n) {
        if (n < 2) return n;
        int numA = 0;
        int numB = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = numA + numB;
            numA = numB;
            numB = res;
        }

        return res;
    }
}
