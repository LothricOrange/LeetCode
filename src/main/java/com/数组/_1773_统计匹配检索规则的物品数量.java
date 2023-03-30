package com.数组;

import java.util.List;

public class _1773_统计匹配检索规则的物品数量 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        int count = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        for (List<String> list : items) {
            String s = list.get(index);
            if (s.equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
