package com.数组;

import java.util.HashSet;

public class TestTest {
    public static void test() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 1;
        int minLastChange = 1;
        int maxLastChange = 1;
        //HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            double rand = Math.random();
            int num = (int) (rand * 100) + 1;
            System.out.println(num);
            /*if (set.add(num)) {
                count += 1;
            }*/
            if (min > num) {
                min = num;
                minLastChange = count;
            }
            if (max < num) {
                max = num;
                maxLastChange = count;
            }
            count += 1;
        }
        System.out.println("最大值为：" + max + "位置为：" + maxLastChange);
        System.out.println("最小值为：" + min + "位置为：" + minLastChange);
    }

    public static void main(String[] args) {
        test();
    }

}
