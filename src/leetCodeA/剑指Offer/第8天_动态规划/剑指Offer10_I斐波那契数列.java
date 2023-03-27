package leetCodeA.剑指Offer.第8天_动态规划;

public class 剑指Offer10_I斐波那契数列 {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int temp = 0;
        if (n < 2) {
            return n;
        }
        for (int i = 1; i < n; i++) {
            temp = first + second;
            if (temp >= 1000000007) {
                temp -= 1000000007;
            }
            first = second;
            second = temp;
        }
        return temp;
    }
}
