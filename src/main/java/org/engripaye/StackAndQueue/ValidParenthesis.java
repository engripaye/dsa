package org.engripaye.StackAndQueue;

import java.util.Stack;

public class ValidParenthesis {

    // check for brackets that are properly closed and nested or not {} or {]

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if( c == '(' || c == '{' || c == '[') {
                stack.push(c); // push opening bracket to stack
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket
                char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '['))   {

                        return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // if stack is empty, its valid
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("{)")); // false
        System.out.println(isValid("{[]}")); // true
    }
}
