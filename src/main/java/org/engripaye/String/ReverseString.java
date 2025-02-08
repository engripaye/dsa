package org.engripaye.String;

public class ReverseString {

    // Reverse a word "hello -> olleh"

    public static String reverse(String s) {
        char[] chars = s.toCharArray(); // convert the string to an array of letters

        int left = 0, right = chars.length - 1; // set two pointers

        while (left < right) {
            // swap letters at left and right positions

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left ++; // move left pointer forward

            right --; // move right pointer backward
        }

        return new String(chars); // convert arrays back to string
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // output olleh
    }
}
