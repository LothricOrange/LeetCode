package newBegin.question_of_the_day;

import java.util.HashMap;
import java.util.Map;

public class _2404_出现最频繁的偶数元素 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if ((num & 1) == 0) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        int res = -1;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if (v >= max) {
                if (v == max) {
                    res = Math.min(entry.getKey(), res);
                } else {
                    res = entry.getKey();
                }
                max = v;
            }
        }
        return res;
    }
}
