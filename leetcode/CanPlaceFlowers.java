package LeetCode;

public class CanPlaceFlowers {
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int counter = 0;

    // Schritt für Schritt durchgehen (Papier) // LeetCode TestCases prüfen

    for (int i = 0; i < flowerbed.length; i++) {
      if (i == flowerbed.length - 1 && flowerbed[i] == 0) counter++;
      else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
        counter++;
        i++;
      }
      else if (flowerbed[i] == 1) i++;
    }

    return (counter >= n);
  }

  public static void main(String[] args) {
    System.out.println("Hello World");

    /* TESTCASES
    Example 1:
    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true
    */

    assert canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1) == true : "Test 1 failed";

    /*
    Example 2:
    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false
     */

    assert canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2) == false : "Test 2 failed";
  }
}
