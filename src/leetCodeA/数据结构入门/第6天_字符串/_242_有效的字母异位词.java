package leetCodeA.数据结构入门.第6天_字符串;


public class _242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) return false;
        int[] arr = new int[26];
        int index;
        for (int i = 0; i < sLen; i++) {
            index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < tLen; i++) {
            index = t.charAt(i) - 'a';
            arr[index]--;
            if (arr[index] < 0) return false;
        }

        return true;
    }

}
