package org.engripaye.ArraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    // letters that match alphabetically

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // if length are different they cant be anagrams

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray); // sort both words alphabetically
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray); // if they match it's an anagram
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true

        System.out.println(isAnagram("hello", "mary")); // false
    }



}
