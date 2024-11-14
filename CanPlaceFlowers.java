import java.util.Arrays;

public class CanPlaceFlowers {

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int counter = 0;
    boolean flowerWasPlaced = false;

    for (int i = 0; i < flowerbed.length; i++) {
      int lastPlace = 0;
      int nextPlace = 0;
      int currentPlace = flowerbed[i];

      if (flowerWasPlaced) {
        lastPlace = 1;
        flowerWasPlaced = false;
      }

      else if (i != 0) lastPlace = flowerbed[i - 1];

      if (i != flowerbed.length - 1) nextPlace = flowerbed[i + 1];

      if (currentPlace != 1 && lastPlace == 0 && nextPlace == 0) {
        flowerWasPlaced = true;
        counter += 1;
      }
    }

    System.out.println(counter);

    return counter >= n;
  }

  public static void main(String[] args) {
    int[] testFlowerBed = {1, 0, 0, 0, 1};
    boolean result = canPlaceFlowers(testFlowerBed, 1);
  }
}
