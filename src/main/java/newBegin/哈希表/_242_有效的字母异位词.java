package newBegin.哈希表;

public class _242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] sTable = new int[26];
        int[] tTable = new int[26];
        for (char c : sArr) {
            sTable[c - 'a']++;
        }
        for (char c : tArr) {
            tTable[c - 'a']++;
        }
        for (int i = 0; i < sTable.length; i++) {
            if (sTable[i] != tTable[i]) return false;
        }
        return true;
    }
}
