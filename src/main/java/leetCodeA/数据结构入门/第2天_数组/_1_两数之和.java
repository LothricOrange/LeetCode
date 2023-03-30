package leetCodeA.数据结构入门.第2天_数组;

import java.util.HashMap;

public class _1_两数之和 {
    /*public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for (int numberA = 0; numberA < nums.length; numberA++) {
            for (int numberB = 0; numberB < nums.length; numberB++) {
                if (nums[numberA] + nums[numberB] == target && numberA != numberB) {
                    newArr[0] = numberB;
                    newArr[1] = numberA;
                }
            }
        }
        return newArr;
    }*/
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                newArr[0] = map.get(nums[i]);
                newArr[1] = i;
                return newArr;
            }
            map.put(target - nums[i], i);
        }
        return newArr;
    }
}
