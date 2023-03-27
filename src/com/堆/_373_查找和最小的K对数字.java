package com.堆;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class _373_查找和最小的K对数字 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (nums1[a[0]] + nums2[a[1]])));

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new int[] {i, 0});
        }

        while (!pq.isEmpty() && k > 0) {
            int[] index = pq.poll();
            ans.add(List.of(nums1[index[0]], nums2[index[1]]));
            int sIndex = index[1] + 1;
            if (sIndex < nums2.length) {
                pq.add(new int[] {index[0], sIndex});
            }
            k--;
        }

        return ans;

    }

    /*for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new int[]{i, 0});
        }
        while (k > 0 && !pq.isEmpty()) {
            int[] indexArr = pq.poll();
            ans.add(List.of(nums1[indexArr[0]], nums2[indexArr[1]]));
            if (indexArr[1] + 1 < nums2.length) {
                pq.add(new int[]{indexArr[0], indexArr[1] + 1});
            }
            k--;
        }   */
}
