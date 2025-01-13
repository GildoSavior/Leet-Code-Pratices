package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(twoSum(nums1, target1)));

//        // Example 2
//        int[] nums2 = {3, 2, 4};
//        int target2 = 6;
//        System.out.println("Example 2 Output: " + java.util.Arrays.toString(twoSum(nums2, target2)));
//
//        // Example 3
//        int[] nums3 = {3, 3};
//        int target3 = 6;
//        System.out.println("Example 3 Output: " + java.util.Arrays.toString(twoSum(nums3, target3)));
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // Return indices
            }

            // Add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // If no solution is found (though problem guarantees one exists)
        throw new IllegalArgumentException("No solution found");
    }
}