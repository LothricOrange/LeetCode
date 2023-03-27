package leetCodeA.算法入门.第4天_双指针;

public class _344_反转字符串 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }
}
