package com.数组;

public class _1672_最富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {
        int maxMoney = 0;
        int money = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                money += accounts[i][j];
            }
            maxMoney = Math.max(money, maxMoney);
            money = 0;
        }
        return maxMoney;
    }
}
