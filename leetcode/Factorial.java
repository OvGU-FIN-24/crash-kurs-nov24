package LeetCode;

public class Factorial {
  public static int recursiveFactorial(int n) {
    if (n == 1) return 1;
    return n * recursiveFactorial(n - 1);
  }

  public static int iterativeFactorial(int n) {
    int result = 1;

    for(int i = 2; i <= n; i++) {
      result *= i;
    }

    return result;
  }

  public static void main(String[] args){
    assert recursiveFactorial(5) == iterativeFactorial(5) : "5! != 120";
    System.out.println(recursiveFactorial(5));
  }
}
