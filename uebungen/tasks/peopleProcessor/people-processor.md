### Aufgabe: Personen-Daten aus CSV einlesen und bearbeiten

Schreibe eine Java-Anwendung, die eine CSV-Datei (`personen.csv`) mit Personendaten einlesen und verarbeiten kann. Die Anwendung soll:

1. Eine Model-Klasse `Person` haben, die die Felder `vorname`, `nachname`, `alter` enthält.
2. Die CSV-Datei `personen.csv` einlesen und die Zeilen in `Person`-Objekte überführen.
3. Die Liste der Personen bearbeiten, indem das Alter jeder Person um 1 Jahr erhöht wird.
4. Die bearbeiteten `Person`-Objekte in eine neue CSV-Datei (`personen_geaendert.csv`) speichern.

Die CSV-Datei hat folgendes Format:
```csv
FirstName;LastName;Age
Anna;Miller;25
Tom;Smith;30
Lena;Fisher;28
```

#### Requirements:
- Create a `Person` class.
- Implement a method `readPeopleFromCsv(String filePath)` to read the CSV file and return a list of `Person` objects.
- Implement a method `writePeopleToCsv(List<Person> people, String filePath)` to save the modified data to a new CSV file.
- Implement the logic in `main` to read the people, increase their ages, and save the results.

### Tips:
- Use `BufferedReader` to read from and `FileWriter` to write to a file.
- Use `String.split(",")` to split CSV lines into fields.