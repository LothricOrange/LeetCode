package com.字符串;

public class _953_验证外星语词典 {
    public boolean isAlienSorted(String[] words, String order) {
        char[] chars = order.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[chars[i] - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            String str1 = words[i];
            String str2 = words[i - 1];
            int len1 = str1.length();
            int len2 = str2.length();
            int len = len1;
            if (len1 > len2) len = len2;

            int index = 0;
            for (; index < len; index++) {
                char c1 = str1.charAt(index);
                char c2 = str2.charAt(index);
                int compare = arr[c1 - 'a'] - arr[c2 - 'a'];
                if (compare < 0) return false;
                else if (compare == 0) continue;
                else break;
            }
            if (index == len && len1 < len2) return false;

        }
        return true;
    }
}
