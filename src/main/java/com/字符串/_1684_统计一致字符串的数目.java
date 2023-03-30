package com.字符串;

public class _1684_统计一致字符串的数目 {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] chars = allowed.toCharArray();
        int count = 0;
        byte[] arr = new byte[26];
        for (char c : chars) {
            arr[c - 'a'] = 1;
        }
        for (String str : words) {
            char[] tmp = str.toCharArray();
            byte index = 0;
            for (;index < tmp.length; index++) {
                if (arr[tmp[index] - 'a'] != 1)  break;
            }
            if (index == tmp.length) count++;
        }
        return count;
    }
}
