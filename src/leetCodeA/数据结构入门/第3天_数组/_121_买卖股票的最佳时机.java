package leetCodeA.数据结构入门.第3天_数组;

public class _121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int earn = 0;
        int price = prices[0];
        if (len <= 1) return earn;
        for (int i = 1; i < len; i++) {
            earn = Math.max(earn, prices[i] - price);
            price = Math.min(prices[i], price);
        }
        return earn;
    }
}
