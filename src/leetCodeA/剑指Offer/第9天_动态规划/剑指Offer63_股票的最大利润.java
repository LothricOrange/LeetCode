package leetCodeA.剑指Offer.第9天_动态规划;

public class 剑指Offer63_股票的最大利润 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int price = prices[0];
        int earn = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - price;
            if (tmp > 0) {
                if (tmp > earn) earn = tmp;
            } else {
                price = prices[i];
            }
        }
        return earn;
    }

    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int price = prices[0];
        int earn = 0;
        for (int i = 1; i < prices.length; i++) {
            earn = Math.max(earn, prices[i] - price);
            price = Math.min(prices[i], price);
        }
        return earn;
    }
}
