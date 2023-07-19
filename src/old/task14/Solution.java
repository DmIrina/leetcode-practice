package old.task14;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // solution 1 - Brute Force
//        int counter = 1;
//        if (prices.length > 1){
//            while (counter != prices.length){
//                for (int i = 0; i < counter; i++) {
//                    maxProfit = Math.max(prices[counter]-prices[i], maxProfit);
//                }
//                counter++;
//            }
//        }

        // solution 2
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
          System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        // System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
