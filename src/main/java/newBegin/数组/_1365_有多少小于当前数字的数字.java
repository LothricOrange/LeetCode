package newBegin.数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1365_有多少小于当前数字的数字 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < clone.length; i++) {
            if (map.containsKey(clone[i])) continue;
            map.put(clone[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            clone[i] = map.get(nums[i]);
        }


        return clone;
    }
}
