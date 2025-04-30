package src;

import java.util.HashMap;
import java.util.HashSet;

public class IdenticalMapping {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char from = s.charAt(i); // character from string s
            char to = t.charAt(i);   // character from string t

            if (map.containsKey(from)) {
                if (map.get(from) != to) {
                    return false; // mapped value is different from what was expected
                }
            } else {
                if (mappedValues.contains(to)) {
                    return false; // someone else already maps to this 'to' char
                }
                map.put(from, to);         // create the mapping
                mappedValues.add(to);      // mark 'to' as used
            }
        }

        return true; // all mappings are consistent
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}

