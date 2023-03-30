package leetCodeA.数据结构基础.第2天_数组;

import java.util.HashMap;

public class _706_设计哈希映射 {
    HashMap<Integer, Integer> map;
    public _706_设计哈希映射() {
        this.map = new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        if (map == null) return -1;
        if (!map.containsKey(key)) return -1;
        return map.get(key);
    }

    public void remove(int key) {
        if (map == null) return;
        if (!map.containsKey(key)) return;
        map.remove(key);
    }
}
