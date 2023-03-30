package leetCodeA.算法入门.第6天_滑动窗口;

import java.util.HashSet;

public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) return len;
        HashSet<Character> set = new HashSet<>();
        int start = -1;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while ((start + 1 < len) && !set.contains(s.charAt(start + 1))) {
                set.add(s.charAt(start + 1));
                start++;
            }
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
