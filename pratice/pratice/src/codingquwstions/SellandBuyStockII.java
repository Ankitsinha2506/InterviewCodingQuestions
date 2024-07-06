package codingquwstions;

public class SellandBuyStockII {
    public static int sellStock(int [] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int result = sellStock(prices);
        System.out.println(result);
    }
}
