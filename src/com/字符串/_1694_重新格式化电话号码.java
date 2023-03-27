package com.字符串;

public class _1694_重新格式化电话号码 {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c == ' ' || c == '-') continue;
            sb.append(c);
        }

        int len = sb.length();
        if (len <= 3) return sb.toString();
        StringBuilder res = new StringBuilder();
        char[] chars = sb.toString().toCharArray();
        if (len % 3 == 0) {
            for (int i = 0; i < chars.length; i++) {
                if (i != 0 && i % 3 == 0) res.append('-');
                res.append(chars[i]);
            }
        } else {
            for (int i = 0; i < chars.length - 3; i++) {
                if (i != 0 && i % 3 == 0) res.append('-');
                res.append(chars[i]);
            }

            res.append(chars[chars.length - 3]).append('-').append(chars[chars.length - 2]).append(chars[chars.length - 1]);
        }

        return res.toString();
    }
}
