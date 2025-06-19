package src;
public class Vowels {

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s; // No need to reverse if string is null or has 0/1 characters
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // If left and right pointers haven't crossed, swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move pointers inwards after swapping
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "IceCreAm";
        System.out.println("Original: " + s1 + ", Reversed Vowels: " + reverseVowels(s1)); // Output: AceCreIm

        String s2 = "leetcode";
        System.out.println("Original: " + s2 + ", Reversed Vowels: " + reverseVowels(s2)); // Output: leotcede

        String s3 = "hello";
        System.out.println("Original: " + s3 + ", Reversed Vowels: " + reverseVowels(s3)); // Output: holle

        String s4 = "aA";
        System.out.println("Original: " + s4 + ", Reversed Vowels: " + reverseVowels(s4)); // Output: Aa

        String s5 = "aeiou";
        System.out.println("Original: " + s5 + ", Reversed Vowels: " + reverseVowels(s5)); // Output: uoiea

        String s6 = "rhythm";
        System.out.println("Original: " + s6 + ", Reversed Vowels: " + reverseVowels(s6)); // Output: rhythm (no vowels)
    }
}

