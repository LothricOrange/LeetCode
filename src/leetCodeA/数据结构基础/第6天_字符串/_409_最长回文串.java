package leetCodeA.数据结构基础.第6天_字符串;

import java.util.HashSet;

public class _409_最长回文串 {
    public int longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return len;
        int count = 1;
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (set.add(c)) {
            } else {
                count += 2;
                set.remove(c);
            }
        }

        return set.size() == 0 ? count - 1 : count;
    }
}
