package src.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean check(String input) {
        Stack<Character> s = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false; // More closing brackets than opening
                }
                char top = s.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatch in parentheses
                }
            }
        }
        return s.isEmpty(); // Stack should be empty if balanced
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String input = "({})";
        ValidParentheses validParentheses = new ValidParentheses();
        boolean check = validParentheses.check(input);
        System.out.println("Is the input valid? " + check); // Expected Output: true
    }
}
