package zs.zs303;

public class _6124_第一个出现两次的字母 {
    public char repeatedCharacter(String s) {
        short[] arr = new short[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int index = c - 'a';
            if (arr[index] == 1) {
                return c;
            } else {
                arr[index]++;
            }
        }
        return ' ';
    }
}
