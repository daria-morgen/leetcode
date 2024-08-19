package home.dr.leetcode.validParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    /**
     * Example 1:
     *
     * Input: s = "()"
     * Output: true
     * Example 2:
     *
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: s = "(]"
     * Output: false
     *
     * Input: s = "(("
     * Output: false
     *
     * Input: s = "){"
     * Output: false
     *
     * Input: s = "(){}}{"
     * Output: false
     */
    @Test
    void isValid1() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
    }
    @Test
    void isValid2() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()[]{}"));
    }
    @Test
    void isValid3() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("([)]"));
    }
    @Test
    void isValid4() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(("));
    }
    @Test
    void isValid5() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("){"));
    }
    @Test
    void isValid6() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(){}}{"));
    }


}