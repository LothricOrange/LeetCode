package com.哈希表;

import java.util.*;

public class _380_O1时间插入删除和获取随机元素 {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    int size = 0;
    public _380_O1时间插入删除和获取随机元素() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, size);
        size++;
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int index = map.get(val);
        size--;
        int last = list.get(size);
        list.set(index, last);
        list.remove(size);
        map.put(last, index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(size));
    }
}
