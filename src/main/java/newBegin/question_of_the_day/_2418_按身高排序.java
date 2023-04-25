package newBegin.question_of_the_day;

import java.util.*;

public class _2418_按身高排序 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt(Integer::intValue).reversed());
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], i);
        }
        String[] res = new String[names.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[index] = names[entry.getValue()];
            index++;
        }
        return res;
    }
}
