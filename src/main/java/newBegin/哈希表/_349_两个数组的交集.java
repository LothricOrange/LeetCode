package newBegin.哈希表;

import java.util.ArrayList;
import java.util.List;

/**
 1 <= nums1.length, nums2.length <= 1000
 0 <= nums1[i], nums2[i] <= 1000
* */
public class _349_两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        short[] arr = new short[1001];
        List<Integer> list = new ArrayList<>();
        for (int n : nums1) {
            if (arr[n] == 0) arr[n]++;
        }
        for (int n : nums2) {
            if (arr[n] == 1) {
                list.add(n);
                arr[n] = 0;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
