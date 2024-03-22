package home.dr.leetcode.palindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
        Assertions.assertTrue(new Solution().isPalindrome(121));
    }
    @Test
    void isNOTPalindromeWithNegative() {
        Assertions.assertFalse(new Solution().isPalindrome(-121));
    }
    @Test
    void isNOTPalindrome() {
        Assertions.assertFalse(new Solution().isPalindrome(-1));
    }
}