import java.util.Scanner;

public class SchereSteinPapier {

  public static void main(String[] args) {
    System.out.println("Schere [1] Stein [2] Papier [3]");
    Scanner s = new Scanner(System.in);
    int decision = s.nextInt();
    // Kommentar

    //Guard statement - Beende das Spiel wenn User zu dumm ist.
    if (decision < 1 || decision > 3 ) {
      System.err.println("Das ist keine gültige Auswahl! Bye Bye!");
      System.exit(1);
    }

    // Wähle zufällige entscheidung des Gegenspielers (Computer)
    int bot = (int) (Math.random() * 3) + 1;
    System.out.println("Bot wählt" + bot);

    if (decision == bot) {
      System.out.println("unentschieden");
    } else if ((decision == 2 && bot == 1) || // Stein > Schere
               (decision == 1 && bot == 3) || // Schere > Papier
               (decision == 3 && bot == 2)) {  // Papier > Stein
        System.out.println("gewonnen");
    } else {
      System.out.println("verloren :(");
    }

        /*
    if (decision == bot) {
      System.out.println("unentschieden");
    } else if (decision == 2 && bot == 1) {   // Stein > Schere
      System.out.println("gewonnen");
    } else if (decision == 1 && bot == 3) {   //Schere > Papier
      System.out.println("gewonnen");
    } else if (decision == 3 && bot == 2) {  // Papier > Stein
      System.out.println("gewonnen");
    } else {
      System.out.println("verloren :( - Bitte kaufe die Vollversion um weiter zu spielen...");
    } */

  }
}
