package LeetcodeSolutions;
import java.util.*;
/**
 * @author Hayden Hanson
 * 
 * Problem: 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Solution:
 * Use a HashSet to detect the adding of a duplicate integer.
 */
public class containsDuplicate {
    public boolean containsDuplicateSolution(int[] nums) {
        /* Utilizing properties of sets, we can easily detect if there are duplicates in an array */
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            /* if this add operation returns false, we are attempting to add a duplicate */
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}