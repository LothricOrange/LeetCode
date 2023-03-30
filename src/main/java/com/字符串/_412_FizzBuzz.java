package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        /*List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int numberA = i % 3;
            int numberB = i % 5;
            if (numberA == 0 && numberB == 0) {
                list.add("FizzBuzz");
            } else if (numberB == 0) {
                list.add("Buzz");
            } else if (numberA == 0) {
                list.add("Fizz");
            } else {
                list.add(i + "");
            }
        }
        return list;*/
        /*List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            String tmp = "";
            if (i % 3 == 0) tmp += "Fizz";
            if (i % 5 == 0) tmp += "Buzz";
            if (tmp == "") tmp = String.valueOf(i);
            list.add(tmp);
        }
        return list;*/
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
