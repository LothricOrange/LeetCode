package com.数组;

import java.util.ArrayList;
import java.util.List;

public class _658_找到K个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (k > 0) {
            res.add(arr[left]);
            k--;
            left++;
        }

        return res;
    }
}
