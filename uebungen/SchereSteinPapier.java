import java.util.Scanner;

public class SchereSteinPapier {
  // public static int score = 0; // challenge
  // public static float winRate = .5; // challenge

  public static void main(String[] args) {
    // 1. Scanner // 2. gameLoop // 3. prompt // 4. opponentGuess // 5. matching

    Scanner s = new Scanner(System.in);
    int input = 0;

    while (gameLoop(input)) {
      input = s.nextInt();
    }
  }

  public static boolean gameLoop(int input) {
    if (input == 4) return false;
    int opponentGuess = getRandomMove();

    if (input != 0) {
      // challenge 1 2 3 in Schere Stein Papier übersetzen
      System.out.println(input + " vs " + opponentGuess);
      match(input, opponentGuess);
    }

    System.out.println("Schere [1] Stein [2] Papier [3] Exit [4]");
    return true;
  }

  public static int getRandomMove() {
    double rng = Math.random() * 3;
    int guess = (int) Math.ceil(rng);
    return guess;
  }

  public static void match(int playerMove, int botMove) {
    if (playerMove == botMove) {
      System.out.println("Unentschieden!");
      return;
    }

    if (playerMove == 1 && botMove == 3) {
      System.out.println("Gewonnen!");
      return;
    }

    if (playerMove == 2 && botMove == 1) {
      System.out.println("Gewonnen!");
      return;
    }

    if (playerMove == 3 && botMove == 2) {
      System.out.println("Gewonnen!");
      return;
    }

    System.out.println("Verloren!");
  }
}
