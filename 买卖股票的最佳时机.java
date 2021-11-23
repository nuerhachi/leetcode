public class 买卖股票的最佳时机 {
    public static int maxProfit(int[] prices) {
        int profit = 0;

        if (prices.length < 2)
            return 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])
                profit += prices[i]-prices[i-1];
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
