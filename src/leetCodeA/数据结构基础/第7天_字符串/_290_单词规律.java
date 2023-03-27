package leetCodeA.数据结构基础.第7天_字符串;

import java.util.HashMap;
import java.util.HashSet;

public class _290_单词规律 {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) return false;
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) return false;
        HashSet<Character> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if (setA.add(pattern.charAt(i)) == setB.add(strs[i])) {
            } else {
                return false;
            }
        }
        return true;
    }


    public boolean wordPattern2(String pattern, String s) {
        if (pattern == null || s == null) return false;
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) return false;
        HashMap<Character, String> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(strs[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strs[i])) return false;
                map.put(c, strs[i]);
            }
        }
        return true;
    }
}
