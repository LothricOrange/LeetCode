package newBegin.question_of_the_day;

import java.util.ArrayList;
import java.util.List;
public class _1023_驼峰式匹配 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        char[] pat = pattern.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            char[] arr = queries[i].toCharArray();
            int pIndex = 0;
            boolean flag = true;
            for (char c : arr) {
                if (pIndex < pat.length && c == pat[pIndex]) {
                    pIndex++;
                } else if (c <= 'Z') {
                    flag = false;
                    list.add(false);
                    break;
                }
            }
            if (flag) {
                list.add(pIndex == pat.length);
            }
        }

        return list;
    }
}
