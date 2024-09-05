package besttimetobuystock;

public class BestTimeToBuyStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;
        for(int price: prices) {

            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(price, minPrice);
        }

        return maxProfit;
    }
}
