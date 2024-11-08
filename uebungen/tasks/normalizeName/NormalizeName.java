package uebungen.tasks.normalizeName;

import java.util.Arrays;

public class NormalizeName {
    public static void main(String[] args) {
        String name = "anna-maria müller schmidt";
        System.out.println(capitalize(name)); // Ausgabe: "Anna-Maria Müller Schmidt"
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

}
    