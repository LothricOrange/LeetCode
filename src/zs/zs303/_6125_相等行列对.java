package zs.zs303;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _6125_相等行列对 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            List<int[]> list;
            if (map.containsKey(grid[i][0])) {
                list = map.get(grid[i][0]);
                list.add(grid[i]);
            } else {
                list = new ArrayList<>();
                list.add(grid[i]);
                map.put(grid[i][0], list);
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            List<int[]> list = map.get(grid[0][j]);
            if (list == null) continue;
            for (int[] arr : list) {
                int flag = 0;
                for (int i = 0; i < grid.length; i++) {
                    if (arr[i] != grid[i][j]) break;
                    flag++;
                }
                if (flag == grid.length) count++;
            }
        }


        return count;
    }
}
