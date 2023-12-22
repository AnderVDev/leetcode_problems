public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int buy = 0; buy < prices.length; buy++) {
            for (int sell = buy + 1; sell < prices.length; sell++) {
                int pnl = prices[sell] - prices[buy];
                if (pnl > profit)
                    profit = pnl;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = solution.maxProfit(prices);
        System.out.println(profit);
    }
}
