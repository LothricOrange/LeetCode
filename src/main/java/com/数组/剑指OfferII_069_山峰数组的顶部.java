package com.数组;

import java.util.Arrays;

public class 剑指OfferII_069_山峰数组的顶部 {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length - 2;
        int middle;
        while (low < high) {
            middle = low + (high - low) / 2;
            if (arr[middle] > arr[middle + 1]) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return high;
    }
}
