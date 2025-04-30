package src.linkedlist;

public class Solution {
    public String clearStars(String s) {
        // Stack to hold the characters for result
        StringBuilder result = new StringBuilder();

        // We will use a list to store the characters and keep track of the smallest one
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // Remove the lexicographically smallest character from the result stack
                int minIndex = 0;
                for (int i = 1; i < result.length(); i++) {
                    if (result.charAt(i) < result.charAt(minIndex)) {
                        minIndex = i;
                    }
                }
                result.deleteCharAt(minIndex); // Delete the smallest character
            } else {
                // Add non '*' characters to the result stack
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.clearStars("aaba*"));  // Output: "aab"
        System.out.println(solution.clearStars("abc"));    // Output: "abc"
        System.out.println(solution.clearStars("de*"));    // Output: "e" (Expected Output)
    }
}
