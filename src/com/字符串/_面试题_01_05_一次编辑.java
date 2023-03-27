package com.字符串;

public class _面试题_01_05_一次编辑 {
    public boolean oneEditAway(String first, String second) {

        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();
        int compare = arr2.length - arr1.length;
        if (compare == 1) {
            for (int i = 0, j = 0; i < arr1.length; i++, j++) {
                if (arr1[i] != arr2[j]) {
                    if (j > i) return false;
                    i--;
                }
            }
        } else if (compare == -1) {
            for (int i = 0, j = 0; i < arr2.length; i++, j++) {
                if (arr2[i] != arr1[j]) {
                    if (j > i) return false;
                    i--;
                }
            }
        } else if (compare == 0) {
            if (first.equals(second)) return true;
            int count = 1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] != arr1[i]) {
                    count--;
                }
                if (count < 0) return false;
            }
        } else {
            return false;
        }

        return true;
    }
}
