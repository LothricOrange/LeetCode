package com.字符串;

public class _1704_判断字符串的两半是否相似 {
    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();
        int mid = chars.length >> 1;
        int count = 0;
        byte[] arr = new byte[128];
        arr['a'] = arr['e'] = arr['i'] = arr['o'] = arr['u'] = arr['A'] = arr['E'] = arr['I'] = arr['O'] = arr['U'] = 1;
        for (int i = 0; i < mid; i++) {
            if (arr[chars[i]] == 1) count++;
        }
        for (int i = mid; i < chars.length; i++) {
            if (arr[chars[i]] == 1) count--;
        }
        return count == 0;
    }

    public boolean halvesAreAlike1(String s) {
        char[] chars = s.toCharArray();
        int mid = chars.length >> 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < mid; i++) {
            if (chars[i] == 'a'|| chars[i] == 'e'|| chars[i] == 'i'|| chars[i] == 'o'|| chars[i] == 'u'|| chars[i] == 'A'|| chars[i] == 'E'|| chars[i] == 'I'|| chars[i] == 'O'|| chars[i] == 'U') {
                left++;
            }
        }

        for (int i = mid; i < chars.length; i++) {
            if (chars[i] == 'a'|| chars[i] == 'e'|| chars[i] == 'i'|| chars[i] == 'o'|| chars[i] == 'u'|| chars[i] == 'A'|| chars[i] == 'E'|| chars[i] == 'I'|| chars[i] == 'O'|| chars[i] == 'U') {
                right++;
            }
        }

        return left == right;
    }
}
