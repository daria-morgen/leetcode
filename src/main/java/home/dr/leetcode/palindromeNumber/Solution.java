package home.dr.leetcode.palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {

        String string = String.valueOf(x);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) - '0' != string.charAt(string.length() - (i + 1)) - '0') {
                return false;
            }
        }
        return true;
    }
}
