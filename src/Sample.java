package src;

import java.lang.reflect.Array;
import java.util.Arrays;

    public class Sample {
        public int[] plusOne(int[] digits) {
            // Start from the last digit (least significant digit)
            for (int i = digits.length - 1; i >= 0; i--) {
                // Add 1 to the current digit
                digits[i]++;

                // If the current digit is less than 10, no carry, return the result
                if (digits[i] < 10) {
                    return digits;
                }

                // If the current digit becomes 10, set it to 0 and carry 1 to the next significant digit
                digits[i] = 0;
            }

            // If the loop ends and we still have a carry (i.e., all digits were 9),
            // we need to create a new array with an extra 1 at the front
            int[] newNumber = new int[digits.length + 1];
            newNumber[0] = 1;  // Set the most significant digit to 1
            return newNumber;
        }
        public static void main(String [] args){
            Sample s = new Sample();
            int[] input = {1, 2, 3};
            int[] result = s.plusOne(input);
            System.out.println(Arrays.toString(result));
        }
    }
