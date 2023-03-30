package newBegin.哈希表;

import java.util.ArrayList;
import java.util.List;

public class _1002_查找共用字符 {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] hash = new int[26];
        for (char c : words[0].toCharArray()) {
            hash[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] hashToOther = new int[26];
            for (char c : words[i].toCharArray()) {
                hashToOther[c - 'a']++;
            }
            for (int j = 0; j < hash.length; j++) {
                hash[j] = Math.min(hash[j], hashToOther[j]);
            }
        }

        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                list.add(String.valueOf((char)(i + 'a')));
                hash[i]--;
            }
        }
        return list;
    }
}
