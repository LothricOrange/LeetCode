package leetCodeA.数据结构入门.第6天_字符串;

public class _383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ranLen = ransomNote.length();
        int magLen = magazine.length();
        if (ranLen > magLen) return false;
        int[] arr = new int[26];
        int index;
        for (int i = 0; i < magLen; i++) {
            index = magazine.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < ranLen; i++) {
            index = ransomNote.charAt(i) - 'a';
            arr[index]--;
            if (arr[index] < 0) return false;
        }
        return true;
    }
}
