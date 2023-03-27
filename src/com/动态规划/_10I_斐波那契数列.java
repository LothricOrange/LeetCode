package com.动态规划;

public class _10I_斐波那契数列 {

    public static void main(String[] args) {
        System.out.println("fib(5) = " + fib(45));
    }
    public static int fib(int n) {
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
