package home.dr.leetcode.RomantoInteger;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int result = getInt(charArray[charArray.length - 1]);
        int previous = result;
        for (int i = charArray.length - 2; i >= 0; i--) {
            char c = charArray[i];
            int anInt = getInt(c);
            if (anInt < previous) {
                result = result - anInt;
            } else {
                result += anInt;
            }
            previous = anInt;
        }
        return result;
    }

    private int getInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
