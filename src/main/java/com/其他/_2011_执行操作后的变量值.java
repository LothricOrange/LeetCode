package com.其他;

public class _2011_执行操作后的变量值 {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }
}
