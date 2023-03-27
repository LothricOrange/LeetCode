package leetCodeA.leetCode75.第2天;

import java.util.HashMap;
import java.util.Map;

public class _205_同构字符串 {
    public boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            if (map.containsKey(ss[i])) {
                if (map.get(ss[i]) != ts[i]) return false;
            } else {
                if (map.containsValue(ts[i])) return false;
                map.put(ss[i], ts[i]);
            }

        }

        return true;
    }


    public boolean isIsomorphic2(String text1, String text2) {
        int indexWord, indexLetter;
        int key[] = new int[128], value[] = new int[128];
        char word[] = text1.toCharArray(), letter[] = text2.toCharArray();

        for (int i = word.length - 1; i >= 0; i--) {
            indexWord = word[i] + 1;                                //將字元轉成對應的ASCII碼 +1是避免跟ASCII碼的0對應字元衝突到
            indexLetter = letter[i] + 1;                            //將字元轉成對應的ASCII碼 +1是避免跟ASCII碼的0對應字元衝突到
            if (key[indexWord] == 0 && value[indexLetter] == 0)      //還沒紀錄word及letter對應的字元
            {
                key[indexWord] = indexLetter;
                value[indexLetter] = indexWord;
            } else if (key[indexWord] != indexLetter || value[indexLetter] != indexWord)     //發現現在的字元對應跟之前紀錄的字元對應不同
                return false;
        }
        return true;
    }
}
