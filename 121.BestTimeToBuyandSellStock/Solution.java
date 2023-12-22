public class Solution {
    // Approach 1: Brute Force
    // public int maxProfit(int[] prices) {
    // int profit = 0;
    // for (int buy = 0; buy < prices.length; buy++) {
    // for (int sell = 1 + buy ; sell < prices.length; sell++) {
    // int pnl = prices[sell] - prices[buy];
    // if (pnl > profit)
    // profit = pnl;
    // }
    // }
    // return profit;
    // }

    // Approach 2: One Pass
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (price - minPrice > profit)
                profit = price - minPrice;

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
