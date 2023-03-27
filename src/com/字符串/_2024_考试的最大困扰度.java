package com.字符串;

import java.util.ArrayList;
import java.util.List;

public class _2024_考试的最大困扰度 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] chars = answerKey.toCharArray();
        int sumTrue = 0, sumFalse = 0;
        int leftTrue = 0, leftFalse = 0, maxSum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'F') {
                sumFalse++;
            } else {
                sumTrue++;
            }

            while (sumFalse > k) {
                if (chars[leftTrue] == 'F') sumFalse--;
                leftTrue++;
            }

            while (sumTrue > k) {
                if (chars[leftFalse] == 'T') sumTrue--;
                leftFalse++;
            }

            maxSum = Math.max(maxSum, Math.max(i - leftTrue, i - leftFalse) + 1);
        }
        return maxSum;
    }
}
