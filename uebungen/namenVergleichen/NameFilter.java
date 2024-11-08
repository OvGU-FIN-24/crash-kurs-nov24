import java.util.*;

public class NameFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Beispielhafte Eingabe mit Namen, die der Benutzer eingeben muss
        System.out.println("Gib die Namen ein (gib 'END' ein, um die Eingabe zu beenden):");
        
        // Liste für die Namen, die vom Benutzer eingegeben werden
        List<String> nameList = new ArrayList<>();
        
        // Namen sammeln
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("END")) {
                break; // Eingabe beenden, wenn der Benutzer 'END' eingibt
            }
            nameList.add(input);
        }
        
        // Eindeutige Namen speichern
        List<String> uniqueNames = getUniqueNames(nameList);
        
        // Ausgabe der eindeutigen Namen
        System.out.println("Eindeutige Namen (Capitalized):");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
        
        scanner.close();
    }

    // Methode, um eindeutige Namen zu extrahieren und zu formatieren
    private static List<String> getUniqueNames(List<String> nameList) {
        List<String> uniqueNames = new ArrayList<>();
        
        // Schleife durch alle Namen und überprüfe, ob der Name bereits enthalten ist
        for (String name : nameList) {
            String formattedName = capitalize(name);
            // Prüfe, ob der Name schon in der Liste der eindeutigen Namen enthalten ist
            if (!uniqueNames.contains(formattedName)) {
                uniqueNames.add(formattedName);
            }
        }
        
        return uniqueNames;
    }

    // Hilfsmethode zum Kapitalisieren der Namen (Erster Buchstabe groß, der Rest klein)
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}


/*
Erklärung:
Scanner: Wir verwenden den Scanner, um die Eingabe der Namen durch den Benutzer zu erhalten. Die Eingabe wird fortgesetzt, bis der Benutzer "END" eingibt.
ArrayList: Eine ArrayList wird verwendet, um die Namen zu speichern. Für jedes eingegebene Name prüfen wir, ob es bereits in der Liste der eindeutigen Namen enthalten ist.
capitalize() Methode: Diese Methode formatiert den Namen so, dass der erste Buchstabe groß und der Rest klein ist (auch ohne Bindestriche oder komplexere Namen).
Eindeutige Namen: Wir überprüfen, ob ein Name schon in der Liste uniqueNames enthalten ist, bevor wir ihn hinzufügen. Auf diese Weise wird doppelte Eingabe vermieden.
 */