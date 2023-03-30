package com.字符串;

public class _926_将字符串翻转到单调递增 {
    public int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        int zero = 0, one = 0;
        for(char c: chars){
            if(c == '0'){
                one = Math.min(zero, one) + 1;
            }else{
                one = Math.min(zero, one);
                zero++;
            }
        }
        return Math.min(zero, one);
    }
}
