package src;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and work backwards
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            if (digits[i] < 9) {
                digits[i]++; // Just increment and return
                return digits; // Return if no carry needed
            }
            // If the digit is 9, it becomes 0 and we carry over
            digits[i] = 0;
        }

        // If all digits were 9, we need to add a new leading 1
        int[] result = new int[n + 1]; // Create a new array of size n + 1
        result[0] = 1; // Set the first element to 1
        return result; // The rest of the array will be 0s by default
    }

    public static void main(String[] args) {
        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        System.out.println(Arrays.toString(result2)); // Output: [4, 3, 2, 2]

        int[] digits3 = {9};
        int[] result3 = plusOne(digits3);
        System.out.println(Arrays.toString(result3)); // Output: [1, 0]

        int[] digits4 = {1,9};
        int[] result4 = plusOne(digits4);
        System.out.println(Arrays.toString(result4)); // Output: [1, 0]
    }
}
