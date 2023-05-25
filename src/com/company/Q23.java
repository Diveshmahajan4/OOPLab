package com.company;

import java.util.HashSet;

public class Q23 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate over each element
        for (int num : nums) {
            // Check if the current element is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update the maximum length if necessary
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int length = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}
