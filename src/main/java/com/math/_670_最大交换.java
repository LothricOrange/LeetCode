package com.math;

import java.util.Arrays;

public class _670_最大交换 {
    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        char[] chars = str.toCharArray();
        char[] arr = chars.clone();
        Arrays.sort(arr);
        int index = -1;
        int right = arr.length - 1;
        for (int i = right; i >= 0; i--) {
            if (chars[right - i] != arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) return num;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == arr[right - index]) {
                char tmp = chars[index];
                chars[index] = chars[i];
                chars[i] = tmp;
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }


    public int maximumSwap2(int num) {
        if(num == 0) return 0;
        char[] chars = String.valueOf(num).toCharArray();
        int[] maxIndex = new int[chars.length];
        int max = chars.length - 1;
        for(int j = chars.length - 1; j >= 0; j--){
            if(chars[j] > chars[max]) max = j;
            maxIndex[j] = max;
        }

        for(int i = 0; i < chars.length; i++){
            char iValue = chars[i];
            char maxValue = chars[maxIndex[i]];
            if(maxValue != iValue){
                chars[i] = maxValue;
                chars[maxIndex[i]] = iValue;
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }

}
