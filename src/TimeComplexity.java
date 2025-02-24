package src;

import java.util.ArrayList;

public class TimeComplexity {


    public static void  main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int n = nums.length;
        int k=3;
        // Each rotation moves all elements 1 step to the right
        k = k % n; // Handle cases where k >= n
        for (int i = 0; i < k; i++) {
            // Store the last element
            int previous = nums[n - 1];
            // Shift all elements right
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            // Place the stored element at the first position
            nums[0] = previous;
        }
    }

}
