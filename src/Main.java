package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// The class containing the method to find summary ranges, now named 'Range'
class Range { // Class name changed from Solution to Range
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        // Handle edge case: if the array is null or empty, return an empty list.
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 'i' will serve as the starting pointer for the current range.
        // The loop increment for 'i' is handled inside the loop itself.
        for (int i = 0; i < nums.length; /* 'i' is updated at the end of the loop body */) {
            // 'a' stores the starting value of the current range.
            int a = nums[i];

            // 'j' will be the scanning pointer to find the end of the consecutive sequence.
            // It starts at the same position as 'i'.
            int j = i;

            // This while loop extends the range:
            // 1. Checks if 'j + 1' is a valid index (to prevent IndexOutOfBoundsException).
            // 2. Checks if the next number (nums[j + 1]) is exactly one greater than the current number (nums[j]).
            while (j + 1 < nums.length && (nums[j] + 1) == nums[j + 1]) {
                j++; // If consecutive, move 'j' forward to include the next number in the range.
            }

            // 'b' stores the ending value of the current range (the value at 'j' after the while loop).
            int b = nums[j];

            // Now, format the range string based on whether it's a single number or a range.
            if (a == b) {
                // If start and end are the same, it's a single number range (e.g., "7").
                result.add(String.valueOf(a));
            } else {
                // If start and end are different, it's a multiple number range (e.g., "0->2").
                result.add(a + "->" + b);
            }

            // Important: Move the 'i' pointer for the next iteration to the position
            // immediately after the current range's end ('j').
            // This ensures we start searching for a new range from an unprocessed number.
            i = j + 1;
        }

        return result;
    }
}

// Main class to run and test the solution
public class Main {
    public static void main(String[] args) {
        Range solver = new Range(); // Instance of the 'Range' class

        // --- Test Case 1: Example 1 ---
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        List<String> result1 = solver.summaryRanges(nums1);
        System.out.println("Output 1: " + result1); // Expected: ["0->2", "4->5", "7"]
        System.out.println("--------------------");

        // --- Test Case 2: Example 2 ---
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        List<String> result2 = solver.summaryRanges(nums2);
        System.out.println("Output 2: " + result2); // Expected: ["0", "2->4", "6", "8->9"]
        System.out.println("--------------------");

        // --- Test Case 3: Empty array ---
        int[] nums3 = {};
        System.out.println("Input 3: " + Arrays.toString(nums3));
        List<String> result3 = solver.summaryRanges(nums3);
        System.out.println("Output 3: " + result3); // Expected: []
        System.out.println("--------------------");

        // --- Test Case 4: Single element array ---
        int[] nums4 = {100};
        System.out.println("Input 4: " + Arrays.toString(nums4));
        List<String> result4 = solver.summaryRanges(nums4);
        System.out.println("Output 4: " + result4); // Expected: ["100"]
        System.out.println("--------------------");

        // --- Test Case 5: All consecutive ---
        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println("Input 5: " + Arrays.toString(nums5));
        List<String> result5 = solver.summaryRanges(nums5);
        System.out.println("Output 5: " + result5); // Expected: ["1->5"]
        System.out.println("--------------------");

        // --- Test Case 6: No consecutive numbers ---
        int[] nums6 = {1, 3, 5, 7, 9};
        System.out.println("Input 6: " + Arrays.toString(nums6));
        List<String> result6 = solver.summaryRanges(nums6);
        System.out.println("Output 6: " + result6); // Expected: ["1", "3", "5", "7", "9"]
        System.out.println("--------------------");
    }
}
