package LeetcodeSolutions;
/**
 * @author Hayden Hanson
 * 
 * Problem: 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * Solution:
 * Use 2 pointers, Left and Right, to find the local min and seach for a local max.
 */
public class maxProfit {
    public int maxProfitSolution(int[] prices) {
        int left = 0;
        int right = 1;
        int currentProfit = 0;
        int currentMax = 0;

        /* loop over the entire array of prices */
        while (right < prices.length) {
            /* profitable if right is greater than left */
            if (prices[left] < prices[right]) {
                currentProfit = prices[right] - prices[left];
                currentMax = Math.max(currentMax, currentProfit);
            }
            /* otherwise, set new left, where right was since this is lower */
            else {
                left = right;
            }
            /* always increment right */
            right++;
        }
        return currentMax;
    }
}