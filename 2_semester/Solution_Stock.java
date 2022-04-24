public class Solution_Stock {
    public int maxProfit(int[] prices) {
        int min_price = 10001;
        int today_profit = 0;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++ ){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            today_profit = prices[i] - min_price;
            if(today_profit > max_profit){
                max_profit = today_profit;
            }
        }
        return max_profit;
    }
}