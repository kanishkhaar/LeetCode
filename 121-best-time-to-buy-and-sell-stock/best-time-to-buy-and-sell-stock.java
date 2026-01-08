class Solution {
    public int maxProfit(int[] prices) {
        int buyMin = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            buyMin = Math.min(buyMin, price);
            maxProfit = Math.max(maxProfit, price - buyMin);
        }

        return maxProfit;
    }
}