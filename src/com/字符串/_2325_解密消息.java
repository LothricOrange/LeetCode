package com.字符串;

import java.util.Arrays;

public class _2325_解密消息 {
    public String decodeMessage(String key, String message) {
        char[] arr = new char[26];
        char[] keys = key.toCharArray();
        int count = 0;
        for (char c : keys) {
            int index = (c - 'a');
            if (c == ' ' || arr[index] != 0) continue;
            arr[index] = (char)('a' + count);
            count++;
        }
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            chars[i] = arr[chars[i] - 'a'];
        }

        return String.valueOf(chars);
    }
}
