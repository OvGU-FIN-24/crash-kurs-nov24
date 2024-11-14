package leetcode;

public class Palindrome {

  public static void main(String[] args) {
    boolean result = isPalindrome("racecar");
    boolean result2 = isPalindrome("race a car");
    System.out.println(result);
  }
  
  public static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
      int begin = i;
      int end = s.length() - 1 - i;

      if (s.charAt(begin) != s.charAt(end)) {
        return false;
      }
    }
    
    return true;
  }
}
