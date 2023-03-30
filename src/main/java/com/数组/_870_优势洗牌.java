package com.数组;

import java.util.*;

public class _870_优势洗牌 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        TreeSet<Integer> tset = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) == 1) tset.add(x);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            Integer cur = tset.ceiling(nums2[i] + 1);
            if (cur == null) cur = tset.ceiling(-1);
            ans[i] = cur;
            map.put(cur, map.get(cur) - 1);
            if (map.get(cur) == 0) tset.remove(cur);
        }
        return ans;
    }

    public int[] advantageCount2(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int i = 0; i < nums2.length; i++) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int num = it.next();
                if (num > nums2[i]) {
                    nums2[i] = num;
                    it.remove();
                    break;
                }
            }
            if (!it.hasNext()) {
                for (int n : set) {
                    nums2[i] = n;
                    break;
                }
                set.remove(nums2[i]);
            }
        }


        return nums2;
    }
}
