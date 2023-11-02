//You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a
// different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BestTimeTOBuyAndSellStock {

    public static void main(String[] args) {
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        int[] pricesExampleOne = {7,1,5,3,6,4};
        int maxProfitForExampleOne = maxProfit(pricesExampleOne);
        System.out.println("maxProfit:"+maxProfitForExampleOne);

//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
        int[] pricesExampleTwo = {7,6,4,3,1};
        int maxProfitForExampleTwo = maxProfit(pricesExampleTwo);
        System.out.println("maxProfit:"+maxProfitForExampleTwo);
    }

    //Function find MaxProfit
    //Time Complexity =O(N^2)
    //Space Complexity= O(1)
    static int maxProfit(int[] prices) {

        int profit=0;
        for (int buy=0;buy<prices.length;buy++)
        {
            int temp=0;
            for(int sell=buy+1;sell<prices.length;sell++)
            {
                temp =  prices[sell]-prices[buy];
                if(temp>profit)
                {
                    profit = temp;
                }
            }
        }
        return profit;
    }
}
