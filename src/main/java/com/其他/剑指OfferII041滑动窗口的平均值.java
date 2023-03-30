package com.其他;

public class 剑指OfferII041滑动窗口的平均值 {
    int[] arr;
    int count = 0;

    public 剑指OfferII041滑动窗口的平均值(int size) {
        arr = new int[size];
    }

    public double next(int val) {
        arr[count % arr.length] = val;
        count++;
        double sum = 0;
        for (int a : arr) {
            sum += a;
        }
        int cmp = count - arr.length;

        return cmp > 0 ? sum / arr.length : sum / count;
    }
}
