public class Factorial {

  public static int fac(int n) {
    if (n == 1) return 1;
    else return n * fac(n - 1);
  }

  public static int facIter(int n) {
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    return result;
  }
  
  public static void main(String[] args) {
    System.out.println(facIter(5));
  }
}
