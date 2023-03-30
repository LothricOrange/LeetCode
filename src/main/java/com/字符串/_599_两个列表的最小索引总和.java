package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _599_两个列表的最小索引总和 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum == min) {
                        list.add(list1[i]);
                    } else if (sum < min){
                        min = sum;
                        list.clear();
                        list.add(list1[i]);
                    }
                }
            }
        }

        return list.toArray(new String[0]);
    }
}
