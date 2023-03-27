package com;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[]{"hello", "world", "java"};

        for (int i = 0; i < strs.length; i++) {
            strs[i] = "small";
        }

        for (String str : strs) {
            System.out.println(str);
        }
    }
}
