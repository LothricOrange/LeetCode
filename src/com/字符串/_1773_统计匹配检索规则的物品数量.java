package com.字符串;

import java.util.List;

public class _1773_统计匹配检索规则的物品数量 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("name")) {
            index = 2;
        } else {
            index = 1;
        }
        int count = 0;
        for (List list : items) {
            if (list.get(index).equals(ruleValue)) count++;
        }

        return count;
    }
}
