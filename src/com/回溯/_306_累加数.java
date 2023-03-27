package com.回溯;

import java.util.ArrayList;
import java.util.List;

public class _306_累加数 {

    boolean isAddictive = false;
    List<String> list = new ArrayList();

    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) return false;
        backtrack(num, 0);
        return isAddictive;
    }

    private void backtrack(String num, int idx) {
        if (idx == num.length() && list.size() >= 3 && check(list) && !isAddictive) {
            isAddictive = true;
            return;
        }

        for (int i = idx; i <= num.length(); i++) {
            String subString = num.substring(idx, i);

            if (subString.length() > 1 && subString.charAt(0) != '0' || subString.length() == 1) {

                list.add(subString);

                backtrack(num, i);

                list.remove(list.size() - 1);
            }
        }
    }


    private boolean check(List<String> list) {

        for (int i = 2; i < list.size(); i++) {

            if (!sum(list.get(i - 2), list.get(i - 1)).equals(list.get(i)))
                return false;
        }
        return true;
    }


    private String sum(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        int idx1 = len1 - 1;
        int idx2 = len2 - 1;

        int digit = 0;

        StringBuilder sb = new StringBuilder();

        while (idx1 >= 0 || idx2 >= 0 || digit != 0) {

            int cur = 0;

            if (idx1 >= 0) {
                cur += (int) (s1.charAt(idx1) - '0');
            }
            if (idx2 >= 0) {
                cur += (int) (s2.charAt(idx2) - '0');
            }

            cur += digit;
            digit = cur / 10;
            cur = cur % 10;

            sb.append((char) (cur + '0'));

            idx1--;
            idx2--;


        }

        return sb.reverse().toString();
    }

}

