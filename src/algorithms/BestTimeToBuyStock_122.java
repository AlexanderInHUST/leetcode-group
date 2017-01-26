package algorithms;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class BestTimeToBuyStock_122 {

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyStock_122().maxProfit(new int[]{1, 15, 2, 6, 1, 3, 9, 5, 6}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0, priceIn = 0;
        boolean buy = false;
        for(int i = 0; i < prices.length; i++) {
            if(i == prices.length - 1) {
                if(buy) {
                    buy = false;
                    profit = prices[i] - priceIn + profit;
                    priceIn = 0;
                }
            }else if(!buy) {
                if (prices[i + 1] > prices[i]) {
                    buy = true;
                    priceIn = prices[i];
                }
            } else {
                if (prices[i + 1] < prices[i]) {
                    buy = false;
                    profit = prices[i] - priceIn + profit;
                    priceIn = 0;
                }
            }
        }
        return profit;
    }
}
