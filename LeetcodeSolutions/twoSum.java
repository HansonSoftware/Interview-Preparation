package LeetcodeSolutions;
import java.util.*;
/**
 * @author Hayden Hanson
 * 
 * Problem: 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Solution:
 * Use a HashMap for convienient comparisons of previous values in the array, and the difference between the current value in the array.
 * If there is some difference (target - currentNum) that is in the HashMap, Thats it! We then have 2 values that add up to our target.
 * This ensures that we never use the same element twice.
 * O(n) runtime.
 */
public class twoSum {
    public int[] twoSumSolution(int[] nums, int target) {
        /* we will use a HashMap to store previous values in nums */
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        int difference = 0;
        
        /* loop through the array, comparing the difference between our target and the current num with the values in the map */
        for (int i = 0; i <= nums.length; i++) {
            difference = target - nums[i];
            if (map.containsKey(difference)) {
                solution = new int[]{map.get(difference), i};
                return solution;
            }
            /* stored as <Value, Index> */
            map.put(nums[i], i);
        }
        return solution;
    }
}