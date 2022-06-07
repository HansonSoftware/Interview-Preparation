package LeetcodeSolutions;
/**
 * @author Hayden Hanson
 * 
 * Problem: 
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *  
 * Solution:
 * 
 */
public class productExceptSelf {
    public int[] productExceptSelfSolution(int[] nums) {
        int[] solution = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            solution[i] = prefix;
            prefix *= nums[i];
        }
        
        for (int i = nums.length -1; i >= 0; i--) {
            solution[i] *= postfix;
            postfix *= nums[i];
        }
        return solution;
    }
}