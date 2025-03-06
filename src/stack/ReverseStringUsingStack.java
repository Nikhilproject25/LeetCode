package src.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    // Function to reverse a string using a stack
    public static String reverseString(String input) {
        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Create a StringBuilder to build the reversed string
        StringBuilder reversedString = new StringBuilder();

        // Pop each character from the stack and append it to the StringBuilder
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Convert StringBuilder to a String and return
        return reversedString.toString();
    }

    // Main method to test the reverseString function
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
