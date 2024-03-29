package home.dr.leetcode.RomantoInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToIntIII() {
        Assertions.assertEquals(3,new Solution().romanToInt("III"));
    }
    @Test
    void romanToIntLVIII() {
        Assertions.assertEquals(58,new Solution().romanToInt("LVIII"));
    }
    @Test
    void romanToIntMCMXCIV() {
        Assertions.assertEquals(1994,new Solution().romanToInt("MCMXCIV"));
    }
}