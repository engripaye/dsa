package org.engripaye.String;

import java.util.Locale;

public class ValidPalindrome {

    // word sentence if it reads the same forward and backward "racecar"

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters

        int left = 0, right = s.length() - 1;

       while (left < right) {
           if(s.charAt(left) != s.charAt(right)) return false; // if mismatch then it's not palindrome

           left ++; // move left pointer forward

           right --; // move right pointer backward

       }

       return true; // if no mismatch, then it's palindrome

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));// output true

        System.out.println(isPalindrome("Race car")); // output true

        System.out.println(isPalindrome("Hello Yeah")); // output false
    }
}
