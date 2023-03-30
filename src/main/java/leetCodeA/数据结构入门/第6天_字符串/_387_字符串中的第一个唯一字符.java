package leetCodeA.数据结构入门.第6天_字符串;

public class _387_字符串中的第一个唯一字符 {

    public static int firstUniqChar(String s) {
        int len = s.length();
        if (s == null || len == 0) return -1;
        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            if (arr[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
