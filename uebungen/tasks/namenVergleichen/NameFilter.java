import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import uebungen.tasks.normalizeName.NormalizeName;


public class NameFilter {

    final static String ABS_PATH_PREFIX = "/Users/davide/Documents/repos/crash-kurs-nov24/uebungen/tasks/namenVergleichen/res/";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(ABS_PATH_PREFIX + "namen1.txt");
        Scanner scanner = new Scanner(file);

        List<String> names = new ArrayList<>(); 

        for (int i = 0; scanner.hasNextLine(); i ++) {
            names.add(scanner.nextLine().trim());
        }
 
        // Eindeutige Namen speichern
        List<String> uniqueNames = getUniqueNames(names);
        
        // Ausgabe der eindeutigen Namen
        System.out.println("Eindeutige Namen (Normalized):");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
        
        scanner.close();
    }

    // Methode, um eindeutige Namen zu extrahieren und zu formatieren
    private static List<String> getUniqueNames(List<String> names) {
        List<String> uniqueNames = new ArrayList<>();
        
        // Schleife durch alle Namen und überprüfe, ob der Name bereits enthalten ist
        for (String name : names) {
            String formattedName = NormalizeName.capitalize(name);
            // Prüfe, ob der Name schon in der Liste der eindeutigen Namen enthalten ist
            if (!uniqueNames.contains(formattedName)) {
                uniqueNames.add(formattedName);
            }
        }
        
        return uniqueNames;
    }

}


