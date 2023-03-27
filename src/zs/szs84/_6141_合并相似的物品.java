package zs.szs84;

import java.util.*;

public class _6141_合并相似的物品 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] arr1 : items1) {
            map.put(arr1[0], arr1[1]);
        }
        for (int[] arr2 : items2) {
            if (map.containsKey(arr2[0])) {
                map.put(arr2[0], map.get(arr2[0]) + arr2[1]);
            } else {
                map.put(arr2[0], arr2[1]);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        map.forEach((k, v) -> {
            List<Integer> sonList = new ArrayList<>();
            sonList.add(k);
            sonList.add(v);
            list.add(sonList);
        });
        return list;
    }
}
