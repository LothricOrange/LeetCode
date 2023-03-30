package leetCodeA.数据结构入门.第4天_数组;

import java.util.ArrayList;
import java.util.List;

public class _118_杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        int[][] arr = new int[numRows][numRows];
        List<List<Integer>> fatherList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> sonList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                sonList.add(arr[i][j]);
            }
            fatherList.add(sonList);
        }

        return fatherList;
    }
}
