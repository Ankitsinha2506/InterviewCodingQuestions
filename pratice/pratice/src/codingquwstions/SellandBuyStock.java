package codingquwstions;

public class SellandBuyStock {
    public static int sellStock(int [] prices){
        int buy_prices = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] < buy_prices){
                buy_prices = prices[i];
            }
            else {
                int curr_profit = prices[i] - buy_prices;
                profit = Math.max(curr_profit,profit);
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int [] prices = {3,7,1,5,2,6};
        int result = sellStock(prices);
        System.out.println(result);
    }
}
