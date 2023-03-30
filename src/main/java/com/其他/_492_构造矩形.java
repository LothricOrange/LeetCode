package com.其他;

public class _492_构造矩形 {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int temp = (int) Math.sqrt(area);
        int left = temp;
        int right = temp;
        int chicken;
        while (left <= right) {
            chicken = left * right;
            if (chicken == area) {
                arr[0] = right;
                arr[1] = left;
                return arr;
            } else if (chicken > area) {
                left--;
            } else {
                right++;
            }
        }
        return arr;
    }
}
