package com.数组;

public class _2347_最好的扑克手牌 {
    public String bestHand(int[] ranks, char[] suits) {
        int i = 1;
        for (; i < suits.length; i++) {
            if (suits[i] == suits[0]) continue;
            break;
        }
        if (i == suits.length) return "Flush";

        short[] arr = new short[14];
        for (int rank : ranks) {
            arr[rank]++;
        }

        short max = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) max = arr[j];
        }

        if (max >= 3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}
