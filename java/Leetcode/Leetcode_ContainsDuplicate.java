package Leetcode;

import java.util.HashSet;

public class Leetcode_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {

            // add() return true is the element is distinct therefore if it return 
            // false we return that the element is duplicate
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
