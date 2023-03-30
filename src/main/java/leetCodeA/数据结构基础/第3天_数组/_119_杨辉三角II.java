package leetCodeA.数据结构基础.第3天_数组;

import java.util.ArrayList;
import java.util.List;

public class _119_杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        int cap = rowIndex + 1;
        int[][] arr = new int[cap][cap];
        for (int i = 0; i < cap; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < cap; j++) {
            list.add(arr[rowIndex][j]);
        }
        return list;
    }
}
