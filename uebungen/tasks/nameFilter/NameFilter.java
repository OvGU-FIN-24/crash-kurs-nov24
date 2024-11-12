package uebungen.tasks.nameFilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class NameFilter {

    final static String ABS_PATH_PREFIX = "/Users/davide/Documents/repos/crash-kurs-nov24/uebungen/tasks/namenVergleichen/res/";

    public static void main(String[] args) throws FileNotFoundException {
        filterNames(ABS_PATH_PREFIX + "namen1.txt");
    }

    private static void filterNames(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        List<String> names = new ArrayList<>(); 

        while (scanner.hasNextLine()) {
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
            String formattedName = capitalize(name);
            // Prüfe, ob der Name schon in der Liste der eindeutigen Namen enthalten ist
            if (!uniqueNames.contains(formattedName)) {
                uniqueNames.add(formattedName);
            }
        }
        
        return uniqueNames;
    }

    public static String capitalize(String name) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : name.toCharArray()) {
            switch (c) {
                case ' ':
                case '-':
                    result.append(c);
                    capitalizeNext = true;
                    break;
                default:
                    if (capitalizeNext) {
                        result.append(Character.toUpperCase(c));
                        capitalizeNext = false;
                    } else {
                        result.append(Character.toLowerCase(c));
                    }
            }
        }
        return result.toString();
    }

    // Test capitalizeName
    //String name = "anna-maria müller schmidt";
    //System.out.println(capitalize(name)); // Ausgabe: "Anna-Maria Müller Schmidt"
}


