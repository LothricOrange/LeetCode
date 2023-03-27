package com.数组;

import java.util.Arrays;
import java.util.Comparator;

public class _1710_卡车上的最大单元数 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        for (int[] arr : boxTypes) {
            int tmp = truckSize - arr[0];
            if (tmp >= 0) {
                res += (arr[0] * arr[1]);
            } else {
                res += (truckSize * arr[1]);
                break;
            }
            truckSize = tmp;
        }

        return res;
    }
}
