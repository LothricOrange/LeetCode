package com.哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _811_子域名访问计数 {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] arr = cpdomain.split(" ");
            String[] split = arr[1].split("\\.");
            String str =  arr[1];
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + Integer.parseInt(arr[0]));
            } else {
                map.put(str, Integer.parseInt(arr[0]));
            }

            if (split.length == 2) {
                if (map.containsKey(split[1])) {
                    map.put(split[1], map.get(split[1]) + Integer.parseInt(arr[0]));
                } else {
                    map.put(split[1], Integer.parseInt(arr[0]));
                }
            } else if (split.length == 3) {
                String str1 = split[1] + "." + split[2];
                if (map.containsKey(str1)) {
                    map.put(str1, map.get(str1) + Integer.parseInt(arr[0]));
                } else {
                    map.put(str1, Integer.parseInt(arr[0]));
                }
                String str2 = split[2];
                if (map.containsKey(str2)) {
                    map.put(str2, map.get(str2) + Integer.parseInt(arr[0]));
                } else {
                    map.put(str2, Integer.parseInt(arr[0]));
                }
            }
        }

        map.forEach((k, v) -> {
            list.add(v + " " + k);
        });

        return list;
    }

    public static void main(String[] args) {
        String[] strs = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(strs));
    }
}
