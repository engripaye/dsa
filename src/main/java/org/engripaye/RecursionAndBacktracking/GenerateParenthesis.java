package org.engripaye.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    // ()()() how to arrange a given object in nth terms, they must have a matching later

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max){
        if (current.length() == max * 2) { // base case: valid sequence reached
            result.add(current);
            return;
        }

        if (open < max) { // add '(' if we still have some left

            backtrack(result, STR."\{current}(", open + 1, close, max);

        }
        if (close < open) { // add '(' only if it doesn't exceed open
            backtrack(result, STR."\{current})", open, close + 1, max); // current + ""
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
}
