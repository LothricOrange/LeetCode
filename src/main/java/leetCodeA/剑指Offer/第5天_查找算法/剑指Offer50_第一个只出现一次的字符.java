package leetCodeA.剑指Offer.第5天_查找算法;

public class 剑指Offer50_第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[26];
        for (char c : chars) {
            arr[c - 'a']++;
        }

        for (char c : chars) {
            if (arr[c - 'a'] == 1) return c;
        }

        return ' ';
    }
}
