package LeetCode;

public class BestTimeToBuyStock {
  public static int maxProfit(int[] prices) {
    // Logik // Finde Min // Finde Max // Differenz
    int min = prices[0];
    int max = 0;

    // suche min
    // suche max

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) min = prices[i];
      // erst max versucht, aber nicht geklappt
      if (prices[i] - min > max) max = prices[i] - min;
    }

    // diff
    return max;
  }

  public static void main(String[] args) {
    assert maxProfit(new int[]{7,1,5,3,6,4}) == 5 : "Test 1 failed";
    assert maxProfit(new int[]{7,6,4,3,1}) == 0 : "Test 2 failed";
  }
}
