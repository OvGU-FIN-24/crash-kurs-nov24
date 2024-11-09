package uebungen.leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
 
        for (int i = 0, j = s.length() -1; i < s.length() ; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false; 
            }
        }
        return true; 
    }
}

