package com.字符串;

import java.util.HashMap;
import java.util.Map;

public class _1487_保证文件名唯一 {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            Integer m = 1;
            String temp = names[i];
            if (count.get(names[i]) != null) {
                m = count.get(names[i]);
                temp = names[i] + "(" + m + ")";
                while (count.get(temp) != null) {
                    m++;
                    temp = names[i] + "(" + m + ")";
                }
                count.put(names[i], m);
                names[i] = temp;
            }
            count.put(temp, 1);
        }
        return names;
    }

    /*public String[] getFolderNames(String[] names) {
        String[] arr = new String[names.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            if (map.containsKey(names[i])) {
                Integer v = map.get(names[i]);
                map.put(names[i], v + 1);
            } else {
                arr[i] = names[i];
                map.put(names[i], 0);
            }
        }

        int index = 0;
        for (String name : names) {
            if (arr[index] != null) {
                index++;
                continue;
            }
            while (map.containsKey(name)) {
                Integer v = map.get(name);
                if (v == 0) break;
                char[] chars = name.toCharArray();
                char tmp = chars[chars.length - 2];
                if (tmp >= '0' && tmp <= '9') {
                    chars[chars.length - 2]++;
                    name = new String(chars);
                } else {
                    name = name + "(" + (v + 1) + ")";
                }
            }
            map.put(name, 0);
            arr[index] = name;
            index++;
        }

        return arr;
    }*/
}
