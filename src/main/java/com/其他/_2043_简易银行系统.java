package com.其他;

public class _2043_简易银行系统 {
    private long[] balance;
    public _2043_简易银行系统(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        int index1 = account1 - 1;
        int index2 = account2 - 1;
        if (index1 >= balance.length || index2 >= balance.length) return false;
        long remainder = balance[index1] - money;
        if (remainder < 0) return false;
        balance[index1] = remainder;
        balance[index2] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        int index = account - 1;
        if (index >= balance.length) return false;
        balance[index] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        int index = account - 1;
        if (index >= balance.length) return false;
        long remainder = balance[index] - money;
        if (remainder < 0) return false;
        balance[index] = remainder;
        return true;
    }
}
