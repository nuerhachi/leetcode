public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int profit = 0,min = 0;

        if (prices.length < 2)
            return 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])

        }
        return 0;
    }
}
