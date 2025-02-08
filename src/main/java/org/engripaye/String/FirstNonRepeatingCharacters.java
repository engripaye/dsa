package org.engripaye.String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {

    // find the first non-repeating character in a string

    public static int firstUniqueChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // count occurrences of each character
        for(char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // find the first character that appears only once
        for(int i = 0; i<s.length(); i++) {
            if(countMap.get(s.charAt(i)) == 1) {
                return i; // return index of first non-repeating character
            }
        }

        return -1; // return -1 if all character repeats itself

    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("loveleetcode")); // output 2 // index of v
    }

}
