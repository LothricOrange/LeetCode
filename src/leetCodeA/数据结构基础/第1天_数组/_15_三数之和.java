package leetCodeA.数据结构基础.第1天_数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        if (len < 3) return null;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sonList = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = len - 1;
        while (left < right) {

        }

        return list;
    }
}
