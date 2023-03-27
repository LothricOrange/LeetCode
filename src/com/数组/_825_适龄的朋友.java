package com.数组;

import java.util.Arrays;

public class _825_适龄的朋友 {
    public int numFriendRequests(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        int left, right, mid;
        for (int i = 1; i < ages.length; i++) {
            left = 0;
            right = i;
            while (left < right) {
                mid = (left + right) >> 1;
                if (ages[i] < ((ages[mid] - 7) << 1)) {
                    ans += right - mid;
                    int tmp = mid;
                    while (tmp < right && ages[i] != ages[tmp]) {
                        tmp++;
                    }

                    ans += right - tmp;
                    right = mid;
                } else {
                    left = mid + 1;
                }

            }


        }

        return ans;
    }
}