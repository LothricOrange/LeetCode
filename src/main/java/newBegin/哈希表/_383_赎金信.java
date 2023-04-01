package newBegin.哈希表;

public class _383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();
        if (ransomArr.length > magazineArr.length) return false;
        int[] arr = new int[26];
        for (char c : ransomArr) {
            arr[c - 'a']++;
        }
        for (char c : magazineArr) {
            arr[c - 'a']--;
        }
        for (int i : arr) {
            if (i > 0) return false;
        }
        return true;
    }
}
