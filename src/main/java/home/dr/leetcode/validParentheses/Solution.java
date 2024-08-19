package home.dr.leetcode.validParentheses;

public class Solution {

    /**
     * Given a string s containing just the characters
     * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * '{{()}}'
     */
    public boolean isValid(String s) {

        String currentS = s;
        while (!s.isEmpty()) {

            currentS = s;
            s = s.replace("()", "").replace("{}", "").replace("[]", "");


            if (currentS.length() == s.length()) {
                return false;
            }

        }
        return true;
    }
}
