package src;

public class Palindrome {
    public static void main(String[] args) {
        String input = "1221";

        // Convert to lowercase to handle case insensitivity
        input = input.toLowerCase();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();

        // Loop through half of the string
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the start and end
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Not a palindrome if characters don't match
            }
        }
        return true; // All characters matched, so it's a palindrome
    }
}
