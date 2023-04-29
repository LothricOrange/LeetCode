package newBegin.question_of_the_day;

import java.util.HashSet;

public class _2423_删除字符使频率相同 {
    public boolean equalFrequency(String word) {
        int[] charCount = new int[26];
        int n = word.length();
        for (int i = 0; i < n; i++) {
            charCount[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == 0) {
                continue;
            }
            charCount[i]--;
            HashSet<Integer> frequency = new HashSet<Integer>();
            for (int f : charCount) {
                if (f > 0) {
                    frequency.add(f);
                }
            }
            if (frequency.size() == 1) {
                return true;
            }
            charCount[i]++;
        }
        return false;
    }

    /*public boolean equalFrequency(String word) {
        int[] arr = new int[26];
        char[] chars = word.toCharArray();
        for (char c : chars) {
            arr[c - 'a']++;
        }

        int size = 0;
        int[] set = new int[2];
        int count0 = 0;
        int count1 = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (size == 0) {
                    set[0] = arr[i];
                    size++;
                } else if (size == 1) {
                    if (set[0] != 0 && set[0] != arr[i]) {
                        set[1] = arr[i];
                        size++;
                    }
                } else {
                    flag = true;
                    if (set[0] == arr[i]) {
                        count0++;
                    } else if (set[1] == arr[i]) {
                        count1++;
                    } else {
                        return false;
                    }
                }
            }
        }
        int compare = set[0] - set[1];
        if (compare > 0) {
            if (flag) {
                if (count0 > 0) return false;
            }
        } else {
            if (flag) {
                if (count1 > 0) return false;
            }
        }
        return Math.abs(compare) == 1;
    }*/
}
