package leetCodeA.数据结构入门.第3天_数组;


import java.util.ArrayList;
import java.util.List;

public class _350_两个数组的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        int num = 0;
        for (int tmp : list) {
            arr[num] = tmp;
            num++;
        }
        return arr;
    }
}
