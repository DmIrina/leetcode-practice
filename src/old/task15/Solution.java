package old.task15;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{1, 7, 2, 3, 6, 7, 6, 7}));
        //  System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
