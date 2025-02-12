package org.engripaye.String;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatingCharacter {

    // find the longest words where no letter repeats

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>(); // store unique characters

        int left = 0, maxLength = 0;

        for(int right = 0; right<s.length(); right++){
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left)); // remove the leftmost character
                left ++; // move left pointer forward
            }

            seen.add(s.charAt(right)); // add a new letter

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // output 3
    }
}
