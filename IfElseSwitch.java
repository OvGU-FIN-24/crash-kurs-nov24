public class IfElseSwitch {

  public static void main(String[] args) {
    int age = 19;

    if (age >= 18) {
      System.out.println("Eintritt");
    }

    if (age >= 16) {
      System.out.println("Mit Muttizettel");
    }

    int note = 1;

    if (note == 1) {
      System.out.println("Sehr gut");
    }
    else if (note == 2) {
      System.out.println("gut");
    }
    else if (note == 3) {
      System.out.println("Sehr gut");
    }


    switch (note) {
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("gut");
        break;
    }
  }
}
