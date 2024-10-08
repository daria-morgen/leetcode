package home.dr.leetcode.validParentheses;

import java.util.Stack;

public class Solution {

    /**
     * Given a string s containing just the characters
     * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * '{{()}}'
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
